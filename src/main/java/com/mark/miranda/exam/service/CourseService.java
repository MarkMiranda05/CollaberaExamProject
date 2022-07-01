package com.mark.miranda.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mark.miranda.exam.entity.Course;
import com.mark.miranda.exam.repository.CourseRepository;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public Course saveCourse(Course course) {

	return courseRepository.save(course);
    }

    public Course findCourseById(long courseId) {

	return courseRepository.findCourseById(courseId);
    }

}
