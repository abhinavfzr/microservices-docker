package com.stackroute.controller;

import com.stackroute.domain.User;
import com.stackroute.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/")
public class UserController {


    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("user")
    public ResponseEntity<?> saveUser(@RequestBody User user){
        ResponseEntity responseEntity;

            userService.saveUser(user);
            responseEntity = new ResponseEntity<String>("Successfully Created", HttpStatus.CREATED);
            return responseEntity;

    }


    @GetMapping("users")
    public User getAllUser(){
  return  new User("1","abhinav","12","123");
       // return new ResponseEntity<List<User>>(userService.getAllUser() , HttpStatus.OK);
    }




}
