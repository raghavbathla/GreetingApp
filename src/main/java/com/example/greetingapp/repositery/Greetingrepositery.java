package com.example.greetingapp.repositery;

import com.example.greetingapp.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Greetingrepositery extends JpaRepository<Greeting,Long> {
}
