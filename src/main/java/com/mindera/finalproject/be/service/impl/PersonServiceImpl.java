package com.mindera.finalproject.be.service.impl;

import com.mindera.finalproject.be.TableCreation.TableCreation;
import com.mindera.finalproject.be.converter.PersonConverter;
import com.mindera.finalproject.be.dto.person.PersonCreateDto;
import com.mindera.finalproject.be.dto.person.PersonPublicDto;
import com.mindera.finalproject.be.entity.Person;
import com.mindera.finalproject.be.service.PersonService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbEnhancedClient;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbTable;
import software.amazon.awssdk.enhanced.dynamodb.Key;
import software.amazon.awssdk.enhanced.dynamodb.TableSchema;

import java.util.List;
import java.util.UUID;

@ApplicationScoped
public class PersonServiceImpl implements PersonService {

    private final String TABLE_NAME = "Person";

    @Inject
    TableCreation tableCreation;
    private DynamoDbTable<Person> personTable;

    @Inject
    void personEnchancedService(DynamoDbEnhancedClient dynamoEnhancedClient) {
        personTable = dynamoEnhancedClient.table(TABLE_NAME, TableSchema.fromBean(Person.class));
    }

    @Override
    public List<PersonPublicDto> getAll() {
        return PersonConverter.fromEntityToPublicDtoList(personTable.scan().items().stream().toList());
    }

    @Override
    public PersonPublicDto getById(String id) {
        Person person = personTable.getItem(Key.builder().partitionValue(id).build());
        if (person == null) {
            throw new RuntimeException("TODO yet to implement new expection");
        }
        return PersonConverter.fromEntityToPublicDto(person);
    }

    @Override
    public PersonPublicDto create(PersonCreateDto personCreateDto) {
        Person person = PersonConverter.fromCreateDtoToEntity(personCreateDto);
        String id = "PERSON#" + UUID.randomUUID();
        person.setPK(id);
        person.setSK(id);
        personTable.putItem(person);
        return PersonConverter.fromEntityToPublicDto(person);
    }

    @Override
    public PersonPublicDto update(String id, PersonCreateDto personCreateDto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(String id) {
        personTable.deleteItem(Key.builder().partitionValue(id).build());
    }

}
