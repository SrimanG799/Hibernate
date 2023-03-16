package com.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="marks")

public class Marks {
	@Id
	@Column(name="id")
	int sid;
	@Column(name="name")
	String name;
	@Column(name="course")
	String cname;
	@Column(name="corseid")
	int cid;
	@Column(name="sub1")
	int sub1;
	@Column(name="sub2")
	int sub2;
	@Column(name="sub3")
	int sub3;
	@Column(name="sub4")
	int sub4;
	@Column(name="sub5")
	int sub5;
	@Column(name="sub6")
	int sub6;
	
	@ManyToMany(mappedBy = "marks")
	List<Student>student;
	public Marks() {
		// TODO Auto-generated constructor stub
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getSub1() {
		return sub1;
	}
	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}
	public int getSub2() {
		return sub2;
	}
	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}
	public int getSub3() {
		return sub3;
	}
	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}
	public int getSub4() {
		return sub4;
	}
	public void setSub4(int sub4) {
		this.sub4 = sub4;
	}
	public int getSub5() {
		return sub5;
	}
	public void setSub5(int sub5) {
		this.sub5 = sub5;
	}
	public int getSub6() {
		return sub6;
	}
	public void setSub6(int sub6) {
		this.sub6 = sub6;
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Marks [sid=" + sid + ", name=" + name + ", cname=" + cname + ", cid=" + cid + ", sub1=" + sub1
				+ ", sub2=" + sub2 + ", sub3=" + sub3 + ", sub4=" + sub4 + ", sub5=" + sub5 + ", sub6=" + sub6
				+ ", student=" + student + "]";
	}
	

}
