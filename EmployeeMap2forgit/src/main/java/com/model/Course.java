package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="coursem")
public class Course {
	@Id
	@Column(name="coid")
	int courseid;
	
	@Column(name="cname")
	String coursename;
	
	@OneToOne(mappedBy = "course")
	Student student;
	
	public Course() {
		// TODO Auto-generated constructor stub
	}
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	@Override
	public String toString() {
		return "Course [courseid=" + courseid + ", coursename=" + coursename + "]";
	}
	

}
