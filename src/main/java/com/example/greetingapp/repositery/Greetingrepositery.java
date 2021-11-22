package com.example.greetingapp.repositery;

import com.example.greetingapp.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface Greetingrepositery extends JpaRepository<Greeting,Long> {
}
