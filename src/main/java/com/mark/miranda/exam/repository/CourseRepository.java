package com.mark.miranda.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mark.miranda.exam.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

    Course findCourseById(long courseId);

}
