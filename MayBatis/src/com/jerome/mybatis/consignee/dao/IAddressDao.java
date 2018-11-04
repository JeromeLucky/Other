package com.jerome.mybatis.consignee.dao;

import com.jerome.mybatis.consignee.entity.Address;

public interface IAddressDao {
		public Address findById(int uid);
}
