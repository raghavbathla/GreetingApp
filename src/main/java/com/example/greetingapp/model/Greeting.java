package com.example.greetingapp.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.concurrent.atomic.AtomicLong;
@Entity
@Table(name="GREETINGS")

public class Greeting {
    @Id
    private final Long counter;
    private final String message;

    public Greeting() {
        counter= Long.valueOf(0);
        message="";
    }

    public Greeting(Long counter, String message) {
        this.counter = counter;
        this.message = message;
    }

    public Long getCounter() {
        return counter;
    }

//    public void setCounter(Long counter) {
//        this.counter = counter;
//    }

    public String getMessage() {
        return message;
    }

//    public void setMessage(String message) {
//        this.message = message;
//    }
}
