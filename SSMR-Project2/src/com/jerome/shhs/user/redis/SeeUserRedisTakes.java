package com.jerome.shhs.user.redis;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import com.jerome.shhs.common.RedisBaiseTakes;
import com.jerome.shhs.user.entity.SeeUser;

@Component("seeUserRedisTakes")
public class SeeUserRedisTakes  implements RedisBaiseTakes<String,String,SeeUser> {
		
	 @Resource(name="redisTemplate")
	    private RedisTemplate redisTemplate;
	    private Logger logger = Logger.getLogger(String.valueOf(SeeUserRedisTakes.class));
	@Override
	public void add(String key, String value) {
		if(redisTemplate==null){
            logger.warn("redisTemplate 实例化失败");
            return;
        }else{
           redisTemplate.opsForValue().set(key,value);
        }
	}

	@Override
	public void addObj(String objectKey, String key, SeeUser object) {
		 if(redisTemplate==null){
	            logger.warn("redisTemplate 实例化失败");
	            return;
	        }else{
	            redisTemplate.opsForHash().put(objectKey,key,object);
	        
	        }
	}

	@Override
	public void delete(String key) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(List<String> listKeys) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletObj(String objecyKey, String key) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(String key, String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateObj(String objectKey, String key, SeeUser object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String get(String key) {
		String value = (String) redisTemplate.opsForValue().get(key);
        return value;
	}

	@Override
	public SeeUser getObj(String objectKey, String key) {
		SeeUser seeUser = (SeeUser) redisTemplate.opsForHash().get(objectKey,key);
			
        return seeUser;
	}

}
