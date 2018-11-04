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
		 * @return  RowBounds  适合于  非mysql的查询   
		 * <!-- 配置Mybatis的二级缓存 -->
			<cache eviction="LRU" flushInterval="60000" size="1024" readOnly="true" />
			<select id="findUsers" resultMap="UserResult" flushCache="false" useCache="true">
			select * from user
			</select>

		 */
		public List<Grade> findByPage1(RowBounds rBounds );
		/**
		 * 
		 * @param rBounds
		 * @return  RowBounds  经  开始 位置  start  和    size 传入map  
		 * 
		 * <!-- 配置Mybatis的二级缓存 -->
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
