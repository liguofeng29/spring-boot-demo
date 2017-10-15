package org.lee.spring.boot.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

/**
 *
 *
 CREATE DATABASE sample DEFAULT CHARACTER SET utf8 DEFAULT COLLATE utf8_general_ci;

 CREATE TABLE user (
 id int AUTO_INCREMENT,
 name VARCHAR(40),
 PRIMARY KEY(id)
 );

 INSERT INTO user(name)
 VALUES
 ('user1')
 ,('user2')
 ,('user3');
 */

@Entity
@Table(name="user")
// Solution for : No serializer found for class org.hibernate.proxy.pojo.javassist.JavassistLazyInitializer and no properties discovered to create BeanSerializer
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class User  implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name="name")
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

