package com.jerome.mybatis.on2m.entity;

public class Address {
		private int id;
		private int sid;
		private String  provincial;
		private String  urban;
		private String  area;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getSid() {
			return sid;
		}
		public void setSid(int sid) {
			this.sid = sid;
		}
		public String getProvincial() {
			return provincial;
		}
		public void setProvincial(String provincial) {
			this.provincial = provincial;
		}
		public String getUrban() {
			return urban;
		}
		public void setUrban(String urban) {
			this.urban = urban;
		}
		public String getArea() {
			return area;
		}
		public void setArea(String area) {
			this.area = area;
		}
		@Override
		public String toString() {
			return "Address [id=" + id + ", sid=" + sid + ", provincial=" + provincial + ", urban=" + urban + ", area="
					+ area + "]";
		}
		public Address() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Address(int id, int sid, String provincial, String urban, String area) {
			super();
			this.id = id;
			this.sid = sid;
			this.provincial = provincial;
			this.urban = urban;
			this.area = area;
		}
		
		
		
}
