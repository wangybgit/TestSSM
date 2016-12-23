package com.wyb.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.wyb.domain.User;
import com.wyb.utils.Requests;



public class LoginFilter implements Filter{

	@Override
	public void destroy() {
		System.out.println("=====过滤器销毁！=====");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
        //对request和response进行一些预处理
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        
        HttpServletRequest req=(HttpServletRequest)request;
        HttpServletResponse res=(HttpServletResponse)response;
        
        System.out.println("实际方法执行前！！！");
        HttpSession session=req.getSession(true);
        User user=(User)session.getAttribute("user");
        if(user==null){
        	request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
        chain.doFilter(request, response);  //让目标资源执行，放行
        System.out.println("实际方法执行后！！！");
		 
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("====过滤器初始化！=====");
	}

}
