package com.wlx.mappers;

import java.util.List;
import java.util.Map;

import com.wlx.entity.User;
/**
 * Mybatis映射接口
 * @author wlx
 *
 */
public interface UserMappers
{
	/**
	 * 根据id查询用户以及用户对应的地址
	 * @param id
	 * @return
	 */
	public User findUserAndAddress(Integer id);
	
}
