package com.epam.leaarn.demo.service;

import com.epam.leaarn.demo.domain.User;
import com.epam.leaarn.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;


    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User save(final User user) {
        return userRepository.save(user);
    }
}
