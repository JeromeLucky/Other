package com.jerome.mybatis.on2m.entity;

public class Student {	
		private int id;
		private int gid;
		private String name;
		private String age;
		private Address address;
	
		
		
		public Student(int id, int gid, String name, String age, com.jerome.mybatis.on2m.entity.Address address) {
			super();
			this.id = id;
			this.gid = gid;
			this.name = name;
			this.age = age;
			this.address = address;
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", gid=" + gid + ", name=" + name + ", age=" + age + ", Address=" + address
					+ "]";
		}
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
	
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getGid() {
			return gid;
		}
		public void setGid(int gid) {
			this.gid = gid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAge() {
			return age;
		}
		public void setAge(String age) {
			this.age = age;
		}
		public Address getAddress() {
			return address;
		}
		public void setAddress(Address address) {
			this.address = address;
		}
		
}
