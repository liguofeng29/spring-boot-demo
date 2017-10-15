package org.lee.spring.boot.demo.controller;

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
    private UserService userService;

    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    User readUser(@PathVariable Integer id) {
        User user = userService.readUser(id);
        logger.debug("利用者取得ID :" + user.getId());

        // return JSON
        return user;
    }

    @RequestMapping(value="/", method= RequestMethod.POST)
    String createUser(@RequestParam("name") String name) {
    // String createUser(@PathVariable String name) {
        userService.createUser(name);
        return "利用者" + name + "を登録しました。";
    }


    @RequestMapping(value="/{id}", method= RequestMethod.DELETE)
    String deleteUser(@PathVariable Integer id) {
        userService.deleteUser(id);
        return "利用者" + id + "を削除しました。";
    }

    @RequestMapping("/all")
    List<User> users() {
        // return as JSON
        return userService.getAllUsers();
    }
}
