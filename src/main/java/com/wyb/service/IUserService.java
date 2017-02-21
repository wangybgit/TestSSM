package com.wyb.service;

import java.util.List;
import java.util.Map;

import com.wyb.domain.User;

public interface IUserService {  
    public User getUserById(int userId);

	public int insert(User user);  
	
	public User findUserByUsernameAndPsw(Map<String,String> map);
	
	public User findUserByUserName(String username);
	
	public List<User> findAllUser();
	
}  


