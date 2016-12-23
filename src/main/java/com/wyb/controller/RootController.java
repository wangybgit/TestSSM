package com.wyb.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.wyb.domain.User;
import com.wyb.service.IUserService;

@Controller
@RequestMapping("/login")
public class RootController {
	
	private static final Logger LOG=Logger.getLogger(RootController.class);
	
	@Autowired
	private IUserService userService;
	
	/**
	 * 登录
	 * @param username
	 * @param password
	 * @return
	 */
	@RequestMapping(value="/logincheck",method=RequestMethod.POST)
	public String logincheck(String username,String password,Model m,HttpSession session){
		System.out.println("root controller！");
		Map<String,String> map=new HashMap<String,String>();
		map.put("username", username);
		map.put("password", password);
		User user=userService.findUserByUsernameAndPsw(map);
		if(user==null){
			m.addAttribute("msg","用户信息不存在，请注册！");
			return "/jsp/register";
		}
		session.setAttribute("user", user);
		User sessionuser=(User)session.getAttribute("user");
		System.out.println("session username:"+sessionuser.getUserName());

		return "/jsp/hello"; 
	}
	
	@RequestMapping(value="/logout")
	public String logout(HttpSession session){
		//session.setAttribute("user", null);
		session.invalidate();  
		return "/jsp/login";
	}
	
	@RequestMapping(value="/register")
	public String register(){
		LOG.info("this is register page!");
		return "/jsp/register";
	}
	
	@RequestMapping(value="/registerCheck")
	public String registerCheck(User user,Model m){
		User user1=userService.findUserByUserName(user.getUserName());
		if(user1!=null){
			LOG.info("该用户名已被注册");
			m.addAttribute("msg","该用户名已被注册");
			return "/jsp/register";
		}
		if(user.getUserName().equals("")||user.getPassword().equals("")){
				LOG.info("未输入注册信息");
				m.addAttribute("msg","请输入注册信息");
				return "/jsp/register";
		}
		int n=userService.insert(user);
		if(n<0){
			m.addAttribute("msg","注册失败，请重新注册");
			return "/register";
		}
		LOG.info("注册成功！！！");
		return "/jsp/login";
	}
}
