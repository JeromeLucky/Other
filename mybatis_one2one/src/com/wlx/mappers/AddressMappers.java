package com.wlx.mappers;

import com.wlx.entity.Address;

public interface AddressMappers 
{
	/**
	 * 根据id查询地址信息
	 * @param id
	 * @return
	 */
	public  Address  findById(Integer id);
}
