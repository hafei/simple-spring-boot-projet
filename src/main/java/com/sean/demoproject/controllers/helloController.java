package com.sean.demoproject.controllers;

import com.sean.demoproject.model.Pledge;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class helloController {

    private AtomicLong nextId = new AtomicLong();

    @GetMapping("/hello")
    public String getHello() {
        return "Hello Spring Boot!";
    }

    @GetMapping("/id")
    public long id() {
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
}
