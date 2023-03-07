package com.epam.leaarn.demo.repository;

import com.epam.leaarn.demo.domain.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@DataJpaTest
@ActiveProfiles("DEV")
class UserRepositoryTest {
    private static final String USERNAME = "John";
    private static final String EMAIL = "john@example.com";
    private static final int NUMBER_OF_RECORDS = 1;
    @Autowired
    private UserRepository userRepository;

    @Test
    void testSaveUser() {
        final User user = User.builder()
                .name(USERNAME)
                .email(EMAIL)
                .build();
        userRepository.save(user);

        final List<User> users = userRepository.findAll();
        assertEquals(NUMBER_OF_RECORDS, users.size());
        assertEquals(USERNAME, users.get(0).getName());
        assertEquals(EMAIL, users.get(0).getEmail());
    }
}
