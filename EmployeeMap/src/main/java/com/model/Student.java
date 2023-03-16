package com.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="studentm")
public class Student {
	@Id
	@Column(name="id")
	int sid;
	@Column(name="name")
	String sname;
	
	 @OneToOne(cascade =CascadeType.ALL,fetch=FetchType.LAZY)
	 @JoinColumn(name="coid")
	Course course;
	 
	 @ManyToMany(cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	 @JoinColumn(name="marks")
	 List<Marks> marks;
	 
	 public Student() {
		// TODO Auto-generated constructor stub
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public List<Marks> getMarks() {
		return marks;
	}

	public void setMarks(List<Marks> marks) {
		this.marks = marks;
	}
	 
	
}
