package com.example.greetingapp.service;

import com.example.greetingapp.model.Greeting;
import com.example.greetingapp.model.User;

public interface IgreetingService {
    Greeting addGreeting(User user);
    Greeting getGreetingById(long id);

}
