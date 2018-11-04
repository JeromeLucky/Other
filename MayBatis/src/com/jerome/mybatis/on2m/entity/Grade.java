package com.jerome.mybatis.on2m.entity;

import java.util.ArrayList;

public class Grade {
	private int id;
	private String name;
	private String  manager;
	private ArrayList<Student> students;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public Grade() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Grade(int id, String name, String manager, ArrayList<Student> students) {
		super();
		this.id = id;
		this.name = name;
		this.manager = manager;
		this.students = students;
	}
	@Override
	public String toString() {
		return "Grade [id=" + id + ", name=" + name + ", manager=" + manager + ", students=" + students + "]";
	}
	public ArrayList<Student> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	
}
