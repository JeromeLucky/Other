package com.wlx.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.wlx.entity.User;
/**
 * Mybatis映射接口
 * @author wlx
 *
 */
public interface UserMappers
{
	@Results({
		//用于解决表字段名和类属性名不一致
		@Result(property="pwd",column="password"),
		@Result(property="age",column="uage")
		})
	 	@Select("select * from user32")
	    public List<User> selectUser();
	    
	    @Insert("insert into user32 values(null,#{name},#{pwd},#{age})")
	    public  int insertUser(User user);
	    
	    @Delete("delete from user32  where id=#{id}")
	    public void deleteUser(Integer id);
	
}
