package com.devhub.core.devhubdeveloperssocial.service;

import com.devhub.core.devhubdeveloperssocial.domain.User;
import com.devhub.core.devhubdeveloperssocial.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }
}
