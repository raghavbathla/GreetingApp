package com.example.greetingapp.service;


import com.example.greetingapp.model.Greeting;
import com.example.greetingapp.model.User;
import com.example.greetingapp.repositery.Greetingrepositery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingService implements IgreetingService{
    private static final String template ="Hello %s!";
    private static final AtomicLong counter =new AtomicLong();

    @Autowired
    private Greetingrepositery greetingRepository;
    @Override
    public Greeting addGreeting(User user) {
      String message = String.format(template,(user.toString()).isEmpty() ? "hello World":user.toString());
      return greetingRepository.save(new Greeting(counter.incrementAndGet(),message));
    }

    @Override
    public Greeting getGreetingById(long id) {
        return null;
    }
}
