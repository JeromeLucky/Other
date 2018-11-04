package com.wlx.dao.impl;
import java.util.List;

import com.wlx.dao.UserDao;
import com.wlx.entity.User;
import com.wlx.mappers.UserMappers;

public class UserDaoImpl implements UserDao
{
    
    private UserMappers userMapper = null;
    
    public void setUserMapper(UserMappers userMapper)
    {
        this.userMapper = userMapper;
    }

    /**
     * ÷ÿ–¥∑Ω∑®
     * @return
     * @see com.wlx.dao.UserDao#selectUser()
     */
    @Override
    public List<User> selectUser()
    {
        User user = new User("spring_my","m6666",66);
        userMapper.insertUser(user);
        userMapper.deleteUser(3);
        return userMapper.selectUser();
    }
    
}