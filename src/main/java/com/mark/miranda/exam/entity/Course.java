package com.mark.miranda.exam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long courseId;

    @Column
    private String courseName;

    @Column
    private String courseCode;

    @Column
    private String courseYear;

    public Course() {

    }

    public Course(long courseId, String courseName, String courseCode, String courseYear) {

	this.courseId = courseId;
	this.courseName = courseName;
	this.courseCode = courseCode;
	this.courseYear = courseYear;
    }

    public long getCourseId() {

	return courseId;
    }

    public void setCourseId(long courseId) {

	this.courseId = courseId;
    }

    public String getCourseName() {

	return courseName;
    }

    public void setCourseName(String courseName) {

	this.courseName = courseName;
    }

    public String getCourseCode() {

	return courseCode;
    }

    public void setCourseCode(String courseCode) {

	this.courseCode = courseCode;
    }

    public String getCourseYear() {

	return courseYear;
    }

    public void setCourseYear(String courseYear) {

	this.courseYear = courseYear;
    }

}
