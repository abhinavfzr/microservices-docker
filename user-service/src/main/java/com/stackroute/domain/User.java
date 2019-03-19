package com.stackroute.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User {
    @Id
    String id;
    String name;
    String age;
    String password;

    public User(String name, String age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    public User(String id, String name, String age, String password) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.password = password;
    }

    public User() {
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
