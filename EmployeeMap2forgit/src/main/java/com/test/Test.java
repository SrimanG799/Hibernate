package com.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.model.Course;
import com.model.Marks;
import com.model.Student;
import com.util.SessionUtil;

public class Test {
	public static void main(String[] args) {
		Session session=SessionUtil.getSession();
		Student s1=new Student();
		Course c1=new Course(); 
		Marks m1=new Marks();
		c1.setCourseid(2);
		c1.setCoursename("eee");
		m1.setCname(c1.getCoursename());
		m1.setCid(c1.getCourseid());
		m1.setName("kumar");
		m1.setSid(6);
		m1.setSub1(56);
		m1.setSub2(78);
		m1.setSub3(74);
		m1.setSub4(78);
		m1.setSub5(65);
		m1.setSub6(78);
		List<Marks> mar=new ArrayList();
		mar.add(m1);
		s1.setSid(m1.getSid());
		s1.setSname(m1.getName());
		//s1.setCourse(c1.getCoursename());
		s1.setMarks(mar);
		session.save(s1);
		session.beginTransaction().commit();
		session.close();
	}

}