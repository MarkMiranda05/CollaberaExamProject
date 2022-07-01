package com.mark.miranda.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mark.miranda.exam.entity.Course;
import com.mark.miranda.exam.service.CourseService;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping
    public Course saveCourse(@RequestBody Course course) {

	return courseService.saveCourse(course);
    }

    @GetMapping("/{courseId}")
    public Course findCourseById(@PathVariable("courseId") long courseId) {

	return courseService.findCourseById(courseId);
    }

}
