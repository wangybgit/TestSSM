package com.wyb.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wyb.domain.User;
import com.wyb.service.IUserService;
import com.wyb.service.impl.UserServiceImpl;

@Controller  
@RequestMapping("/user")  
public class UserController {  
//    @Resource  
//    private IUserService userService;  
	@Resource  
	private UserServiceImpl userService; 
      
    @RequestMapping("/showUser")  
    public String toIndex(String id,Model model){  
        //int userId = Integer.parseInt(request.getParameter("id"));  
    	int userId = Integer.parseInt(id);  
        User user = this.userService.getUserById(userId);  
        model.addAttribute("user", user);  
        return "/showUser";  
    }  
}  