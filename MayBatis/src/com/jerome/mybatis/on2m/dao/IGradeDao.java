package com.jerome.mybatis.on2m.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;

import com.jerome.mybatis.on2m.entity.Grade;



public interface IGradeDao {
		public Grade findById(int id);
		/**
		 * 
		 * @param rBounds
		 * @return  RowBounds  �ʺ���  ��mysql�Ĳ�ѯ   
		 * <!-- ����Mybatis�Ķ������� -->
			<cache eviction="LRU" flushInterval="60000" size="1024" readOnly="true" />
			<select id="findUsers" resultMap="UserResult" flushCache="false" useCache="true">
			select * from user
			</select>

		 */
		public List<Grade> findByPage1(RowBounds rBounds );
		/**
		 * 
		 * @param rBounds
		 * @return  RowBounds  ��  ��ʼ λ��  start  ��    size ����map  
		 * 
		 * <!-- ����Mybatis�Ķ������� -->
			<cache eviction="LRU" flushInterval="60000" size="1024" readOnly="true" />
		 * select id="findUser2" parameterType="Map" resultMap="UserResult">
				select * from user
								<if test="start!=null and size!=null">
								limit #{start},#{size}
							</if>
			</select>

		 */
		public List<Grade> findByPage2(Map<String,Object>  map);
}
