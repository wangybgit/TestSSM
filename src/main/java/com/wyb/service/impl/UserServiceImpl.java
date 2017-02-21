package com.wyb.service.impl;

import java.util.List;
import java.util.Map;

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
    
	@Override
	public User findUserByUsernameAndPsw(Map<String,String> map) {
		return this.userDao.findUserByNameAndPsw(map);
	}
	@Override
	public User findUserByUserName(String username) {
		// TODO Auto-generated method stub
		return this.userDao.findUserByUserName(username);
	}
	@Override
	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		return userDao.findAllUser();
	}
    
    
}  