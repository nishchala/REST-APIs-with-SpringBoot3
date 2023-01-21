package com.demo.springboot.learnspringboot.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.demo.springboot.learnspringboot.Course;
import com.demo.springboot.learnspringboot.course.jdbc.CourseJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    // @Autowired
    // private CourseJdbcRepository repository;

    @Autowired
    private CourseJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn PingPong", "nishi"));
        repository.insert(new Course(2, "Learn Azure", "niki"));
        repository.insert(new Course(3, "Learn React", "kiwi"));
        repository.delete(2);
        System.out.println(repository.selectById(1));
    }
    
}
