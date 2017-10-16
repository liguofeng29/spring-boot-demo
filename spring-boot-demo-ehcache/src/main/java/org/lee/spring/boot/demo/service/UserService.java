package org.lee.spring.boot.demo.service;

import org.lee.spring.boot.demo.model.User;
import org.lee.spring.boot.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository userRepository;



    public User readUser(Integer id) {
        return userRepository.getOne(id);
    }

    public User createUser(String name) {
        User user = new User();
        user.setName(name);

        return userRepository.save(user);

    }

    public void deleteUser(Integer id) {
        userRepository.delete(id);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll(new Sort(Sort.Direction.ASC, "id"));
    }
}
