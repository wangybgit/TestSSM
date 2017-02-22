package com.wyb.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wyb.domain.User;
import com.wyb.service.IUserService;
import com.wyb.service.impl.UserServiceImpl;

@Controller  
@RequestMapping("/user")  
public class UserController {  
	
	private static final Logger LOG=Logger.getLogger(UserController.class);
//    @Resource  
//    private IUserService userService;  
	@Autowired  
	private IUserService userService; 
	
//	@Autowired
//	private UserServiceImpl userService;
    
    @RequestMapping("/showUser")   
    public String toIndex(String id,Model model){  
        //int userId = Integer.parseInt(request.getParameter("id"));  
    	int userId = Integer.parseInt(id);  
        User user = this.userService.getUserById(userId);  
        model.addAttribute("user", user);  
        return "/jsp/showUser";  
    } 
    
    @RequestMapping("/showAllUser")
    public String showAllUser( @RequestParam(value="p",required=false,defaultValue="1") Integer pageNum ,Model m){
    	
    	PageHelper.startPage(pageNum, 3); 
    
    	List<User> userlist=userService.findAllUser();//pageNum为页号
    	for(User user :userlist){
    		System.out.println(user.getUserName());
    	}
       	
    	PageInfo<User> pageInfo=new PageInfo<User>(userlist);
    	
    	m.addAttribute("userlist", userlist);
		m.addAttribute("pageInfo", pageInfo);

//		System.out.println("hasNextPage:"+pageInfo.isHasNextPage());
//		System.out.println("pageNum:"+pageInfo.getPageNum());
//		System.out.println("size:"+pageInfo.getSize());
//		System.out.println("total:"+pageInfo.getTotal());
//		System.out.println("pages:"+pageInfo.getPages());
		

    	return "/jsp/showAllUser";
    	
    }
}  