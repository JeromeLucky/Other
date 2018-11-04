package com.jerome.mybatis.consignee.entity;



public class Address {
		private int aid;
		private String  provincial;
		private String  urban;
		private String  area;
		@Override
		public String toString() {
			return "Address [provincial=" + provincial + ", urban=" + urban + ", area=" + area + "]";
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
		public Address() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Address(Integer  aid,String provincial, String urban, String area) {
			super();
			this.aid=aid;
			this.provincial = provincial;
			this.urban = urban;
			this.area = area;
		}
		public int getAid() {
			return aid;
		}
		public void setAid(int aid) {
			this.aid = aid;
		}
		
		
}
