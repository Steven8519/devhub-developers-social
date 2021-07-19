package com.devhub.core.devhubdeveloperssocial.controller;

import com.devhub.core.devhubdeveloperssocial.domain.User;
import com.devhub.core.devhubdeveloperssocial.service.UserService;
import com.devhub.core.devhubdeveloperssocial.shared.GenericResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/1.0/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public GenericResponse saveUser(@RequestBody User user) {
        userService.save(user);
        GenericResponse body = new GenericResponse();
        return new GenericResponse("User saved");
    }
}
