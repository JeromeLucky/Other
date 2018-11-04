package com.jerome.mybatis.consignee.entity;

public class Consignee {
			private int uid;
			private String name;
			private int age;
			private Address address;
			public Consignee(int uid, String name, int age, Address address) {
				super();
				this.uid = uid;
				this.name = name;
				this.age = age;
			
				this.address = address;
			}
			public Consignee() {
				super();
				// TODO Auto-generated constructor stub
			}
			@Override
			public String toString() {
				return "Consignee [uid=" + uid + ", name=" + name + ", age=" + age + ", address=" + address + "]";
			}
			public int getUid() {
				return uid;
			}
			public void setUid(int uid) {
				this.uid = uid;
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
			public Address getAddress() {
				return address;
			}
			public void setAddress(Address address) {
				this.address = address;
			}
			
			
			
}
