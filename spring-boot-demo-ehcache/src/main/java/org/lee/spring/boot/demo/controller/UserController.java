package org.lee.spring.boot.demo.controller;

import org.lee.spring.boot.demo.cache.UserCacheService;
import org.lee.spring.boot.demo.model.User;
import org.lee.spring.boot.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/user")
public class UserController {

    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserCacheService userCacheService;

    @RequestMapping(value="/create/{name}")
    User createUser(@PathVariable String name) {
        User user = new User();
        user.setName(name);
        return userCacheService.createUser(user);
    }

    @RequestMapping(value="/read/{id}")
    User readUser(@PathVariable Integer id) {
        User user = userCacheService.readUser(id);
        System.out.println(user);
        return  user;
    }

    @RequestMapping(value="/delete/{id}")
    String deleteUser(@PathVariable Integer id) {
        userCacheService.deleteUser(id);
        return "delete user " + id;
    }

    @RequestMapping(value="/update/{id}/{name}")
    User updateUser(@PathVariable Integer id, @PathVariable String name) {
        User user = userCacheService.readUser(id);
        user.setName(name);
        return userCacheService.updateUser(user);
    }
}
