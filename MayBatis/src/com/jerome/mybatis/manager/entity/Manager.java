package com.jerome.mybatis.manager.entity;

public class Manager {
			private int id;
			private String name;
			private int age;
			public Manager() {
				super();
				// TODO Auto-generated constructor stub
			}
			public Manager(int id, String name, int age) {
				super();
				this.id = id;
				this.name = name;
				this.age = age;
			}
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
			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				this.age = age;
			}
			@Override
			public String toString() {
				return "Manager [id=" + id + ", name=" + name + ", age=" + age + "]";
			}
			
}
