package com.devhub.core.devhubdeveloperssocial.controller;

import com.devhub.core.devhubdeveloperssocial.domain.User;
import com.devhub.core.devhubdeveloperssocial.repository.UserRepository;
import com.devhub.core.devhubdeveloperssocial.shared.GenericResponse;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class UserControllerTest {

    private static final String API_1_0_USERS = "/api/1.0/users";

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Autowired
    private UserRepository userRepository;

    @Before
    public void cleanup() {
        userRepository.deleteAll();
    }

    @Test
    public void postUser_whenUserIsValid_receiveOk() {
        User user = createValidUser();
        ResponseEntity<Object> responseEntity = testRestTemplate.postForEntity(API_1_0_USERS, user, Object.class);
        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
    }

    private User createValidUser() {
        User user = new User();
        user.setFirstName("test");
        user.setLastName("test1");
        user.setUsername("test-user");
        user.setDisplayName("test-display");
        user.setPassword("password4");
        return user;
    }

    @Test
    public void postUser_whenUserIsValid_userSavedToDatabase() {
        User user = createValidUser();
        testRestTemplate.postForEntity(API_1_0_USERS, user, Object.class);
        assertThat(userRepository.count()).isEqualTo(1);
    }

    @Test
    public void postUser_whenUserIsValid_receiveSuccessMessage() {
        User user = createValidUser();
        ResponseEntity<GenericResponse> responseEntity = testRestTemplate.postForEntity(API_1_0_USERS, user, GenericResponse.class);
        assertThat(responseEntity.getBody().getMessage()).isNotNull();
    }

}
