package com.mindera.finalproject.be.repository;

import com.mindera.finalproject.be.entity.Student;
import jakarta.enterprise.context.ApplicationScoped;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbTable;
import software.amazon.awssdk.enhanced.dynamodb.Key;

import java.util.List;

import static com.mindera.finalproject.be.config.DynamoDbConfig.client;
import static com.mindera.finalproject.be.repository.schema.TableSchemas.studentTableSchema;

@ApplicationScoped
public class StudentRepository {
    DynamoDbTable<Student> table = client.table("StudentTable", studentTableSchema);

    public StudentRepository() {
        table.createTable();
    }

    public void save(Student student) {
        table.putItem(student);
    }

    public List<Student> getAll() {
        return table.scan().items().stream().toList();
    }

    public Student getById(Long id) {
        return table.getItem(Key.builder().partitionValue(id).build());
    }

    public void update(Student student) {
        table.updateItem(student);
    }

    public void delete(Long id) {
        table.deleteItem(Key.builder().partitionValue(id).build());
    }

}
