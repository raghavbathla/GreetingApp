package com.example.greetingapp.controller;


import com.example.greetingapp.model.Greeting;
import com.example.greetingapp.model.User;
import com.example.greetingapp.service.IgreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template ="Hello %s!";
    private static final AtomicLong counter =new AtomicLong();

    @Autowired
    private IgreetingService greetingService;
//     @GetMapping("/greeting")
//    public Greeting greeting(@RequestParam(value = "name",defaultValue = "world") String name) {
//        return new Greeting(counter.incrementAndGet(),String.format(template,name));
//    }
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name",defaultValue = "world") String name) {
        User user = new User();
        user.setFirstName(name);
        return greetingService.addGreeting(user);
    }
}
