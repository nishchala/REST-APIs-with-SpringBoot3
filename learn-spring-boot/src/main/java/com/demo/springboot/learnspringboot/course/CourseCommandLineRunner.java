package com.demo.springboot.learnspringboot.course;

import org.apache.catalina.startup.ClassLoaderFactory.RepositoryType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.demo.springboot.learnspringboot.Course;
import com.demo.springboot.learnspringboot.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    // @Autowired
    // private CourseJdbcRepository repository;

    // @Autowired
    // private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "Learn PingPong", "nishi"));
        repository.save(new Course(2, "Learn Azure", "niki"));
        repository.save(new Course(3, "Learn React", "kiwi"));
        repository.deleteById(2L);
        System.out.println(repository.findById(1L));
        System.out.println(repository.findAll());
        System.out.println("by author: " + repository.findByAuthor("nishi"));
    }
    
}
