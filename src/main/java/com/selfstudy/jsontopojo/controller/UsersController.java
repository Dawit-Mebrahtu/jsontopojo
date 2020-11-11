package com.selfstudy.jsontopojo.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.selfstudy.jsontopojo.entity.User;
import com.selfstudy.jsontopojo.entity.UsersList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
public class UsersController {
    private static final String apiUrl = "https://jsonplaceholder.typicode.com/users";
    private static Logger logger = LoggerFactory.getLogger(UsersController.class);

    @Autowired
    RestTemplate restTemplate;

    @Value("${my.name}")
    String name;

    // reading from global setting listed in .spring-boot-devtools.properties file located in home directory
    @GetMapping("/users")
    public List<User> getAllUsers(){
        System.out.println("MY NAME IS " + name);

        //reference website https://www.baeldung.com/spring-rest-template-list

        User[] response = restTemplate.getForObject(apiUrl, User[].class);

        logger.info(Arrays.toString(response));

        return Arrays.asList(response);

    }
}
