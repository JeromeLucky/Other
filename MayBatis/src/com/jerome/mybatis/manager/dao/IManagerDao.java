package com.jerome.mybatis.manager.dao;

import java.util.List;
import java.util.Map;

import com.jerome.mybatis.manager.entity.Manager;


public interface IManagerDao {
		public List<Manager>  queryByConditions(Map map);
		public List<Manager>  queryByAge(Map map);
		public int update(Manager manager);
}
