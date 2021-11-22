package com.example.greetingapp.service;

import com.example.greetingapp.model.Greeting;
import com.example.greetingapp.model.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public interface IgreetingService {
    Greeting addGreeting(User user);
    Greeting getGreetingById(long id);

}
