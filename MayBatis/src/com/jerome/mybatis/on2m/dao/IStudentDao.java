package com.jerome.mybatis.on2m.dao;

import java.util.List;

import com.jerome.mybatis.on2m.entity.Student;

public interface IStudentDao {
		public List<Student> findBygId(int gid);
}
