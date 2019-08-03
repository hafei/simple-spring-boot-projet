package com.sean.demoproject.controllers;


import com.sean.demoproject.entity.User;
import com.sean.demoproject.model.Pledge;
import com.sean.demoproject.services.UserService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping(value = "/hello")
public class helloController {

    private Logger logger = LoggerFactory.getLogger(helloController.class);
    private AtomicLong nextId = new AtomicLong();

    @Autowired
    private UserService userService;
    @ApiOperation(value = "Hello")
    @GetMapping("/hello")
    public String getHello() {
        logger.info("Hello Spring Boot");
        return "Hello Spring Boot!";
    }

    @GetMapping("/id")
    public long id() {
        logger.info("/id");
        return nextId.incrementAndGet();
    }

    @GetMapping("/pledges")
    public List<Pledge> getAllPledges(){
        List<Pledge> pledges = new ArrayList<>();
        pledges.add(new Pledge(1,"Sean","xx"));
        pledges.add(new Pledge(2,"boris","yy"));
        pledges.add(new Pledge(3,"jim","zz"));
        return pledges;
    }

    @PostMapping(value = "user")
    public void User(@RequestBody User user){
        userService.AddUser(user);
    }
}
