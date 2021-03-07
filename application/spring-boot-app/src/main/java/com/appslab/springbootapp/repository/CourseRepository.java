package com.appslab.springbootapp.repository;

import com.appslab.springbootapp.model.Course;
import org.springframework.data.repository.CrudRepository;


public interface CourseRepository extends CrudRepository<Course,String> {
}
