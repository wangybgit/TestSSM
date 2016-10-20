package com.wyb.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wyb.dao.IUserDao;
import com.wyb.domain.User;
import com.wyb.service.IUserService;

@Service("userService")  
public class UserServiceImpl implements IUserService {  
    @Resource  
    private IUserDao userDao;  
    @Override  
    public User getUserById(int userId) {  
        // TODO Auto-generated method stub  
        return this.userDao.selectByPrimaryKey(userId);  
    }  
    @Override
    public int insert(User user){
    	return this.userDao.insert(user);
    }
}  