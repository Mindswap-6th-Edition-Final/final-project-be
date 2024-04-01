package com.mindera.finalproject.be.Registration;


class RegistrationServiceTests {

//    @InjectMocks
//    private RegistrationServiceImpl registrationService;
//
//    @Mock
//    private RegistrationRepository registrationRepository;
//
//    @BeforeEach
//    public void init() {
//        MockitoAnnotations.openMocks(this);
//    }
//
//    @Test
//    void testCreateRegistration() {
//        RegistrationCreateDto registrationCreateDto = new RegistrationCreateDto(
//                "registrationId",
//                1L,
//                1L,
//                "status",
//                "finalGrade",
//                true
//        );
//
//        Registration registration = new Registration(
//                "registrationId",
//                1L,
//                1L,
//                "status",
//                "finalGrade",
//                true
//        );
//
//        when(registrationRepository.save(registration)).thenReturn(registration);
//
//        Registration result = registrationService.create(registrationCreateDto);
//
//        assertEquals(registration, result);
//    }
//
//    @Test
//    public void testGetAll() {
//        RegistrationCreateDto registrationCreateDto = new RegistrationCreateDto(
//                "registrationId",
//                1L,
//                1L,
//                "status",
//                "finalGrade",
//                true
//        );
//
//        Registration registration = new Registration(
//                "registrationId",
//                1L,
//                1L,
//                "status",
//                "finalGrade",
//                true
//        );
//
//        when(registrationRepository.save(any(Registration.class))).thenReturn(registration);
//
//        Registration savedRegistration = registrationRepository.save(registration);
//
//        RegistrationPublicDto registrationPublicDto = new RegistrationPublicDto(
//                "status",
//                "finalGrade",
//                true
//        );
//
//        when(registrationRepository.getAll()).thenReturn(List.of(savedRegistration));
//
//        List<RegistrationPublicDto> result = registrationService.getAll();
//
//        assertEquals(List.of(registrationPublicDto), result);
//    }
//
//    @Test
//    public void testGetByCompositeKey() {
//        Registration registration = new Registration(
//                "registrationId",
//                1L,
//                1L,
//                "status",
//                "finalGrade",
//                true
//        );
//
//        when(registrationRepository.getByCompositeKey(any())).thenReturn(registration);
//
//        RegistrationPublicDto registrationPublicDto = new RegistrationPublicDto(
//                "status",
//                "finalGrade",
//                true
//        );
//
//        RegistrationPublicDto result = registrationService.getByCompositeKey("registrationId");
//
//        assertEquals(registrationPublicDto, result);
//    }
//
//    @Test
//    public void testUpdate() {
//        RegistrationCreateDto registrationCreateDto = new RegistrationCreateDto(
//                "registrationId",
//                1L,
//                1L,
//                "status",
//                "finalGrade",
//                true
//        );
//
//        Registration registration = new Registration(
//                "registrationId",
//                1L,
//                1L,
//                "status",
//                "finalGrade",
//                true
//        );
//
//        when(registrationRepository.getByCompositeKey(any())).thenReturn(registration);
//        when(registrationRepository.save(any(Registration.class))).thenReturn(registration);
//
//        RegistrationPublicDto registrationPublicDto = new RegistrationPublicDto(
//                "status",
//                "finalGrade",
//                true
//        );
//
//        RegistrationPublicDto result = registrationService.update("registrationId", registrationCreateDto);
//
//        assertEquals(registrationPublicDto, result);
//    }
//
//    @Test
//    public void testSoftDelete() {
//        // Step 1: Create a Registration object
//        RegistrationCreateDto registrationCreateDto = new RegistrationCreateDto(
//                "registrationId",
//                1L,
//                1L,
//                "status",
//                "finalGrade",
//                true
//        );
//
//        Registration registration = new Registration(
//                "registrationId",
//                1L,
//                1L,
//                "status",
//                "finalGrade",
//                true
//        );
//
//        when(registrationRepository.save(any(Registration.class))).thenReturn(registration);
//
//        // Step 2: Stub the getByCompositeKey method to return the Registration object
//        when(registrationRepository.getByCompositeKey(any())).thenReturn(registration);
//
//        // Step 3: Call the delete method of the RegistrationService
//        registrationService.delete(registration.getCompositeKey());
//
//        // Step 4: Stub the getByCompositeKey method to return the updated Registration object
//        Registration updatedRegistration = new Registration(
//                "registrationId",
//                1L,
//                1L,
//                "status",
//                "finalGrade",
//                false
//        );
//
//        when(registrationRepository.getByCompositeKey(any())).thenReturn(updatedRegistration);
//
//        // Step 5: Retrieve the Registration object again and assert that the active field is false
//        Registration result = registrationRepository.getByCompositeKey(registration.getCompositeKey());
//        assertFalse(result.getActive());
//    }

}
