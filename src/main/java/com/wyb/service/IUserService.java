package com.wyb.service;

import com.wyb.domain.User;

public interface IUserService {  
    public User getUserById(int userId);

	public int insert(User user);  
}  

