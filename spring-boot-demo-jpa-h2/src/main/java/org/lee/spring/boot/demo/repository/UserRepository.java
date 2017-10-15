package org.lee.spring.boot.demo.repository;

import org.lee.spring.boot.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
