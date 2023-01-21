package com.demo.springboot.learnspringboot.course.jdbc;

import org.springframework.stereotype.Repository;

import com.demo.springboot.learnspringboot.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void insert(Course course) {
        entityManager.merge(course);
    }

    public void delete(long id) {
        entityManager.remove(entityManager.find(Course.class, id));
    }

    public Course selectById(long id) {
        return entityManager.find(Course.class, id);
    }

    
}
