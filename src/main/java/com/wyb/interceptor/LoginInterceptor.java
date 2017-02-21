package com.wyb.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.wyb.domain.User;

public class LoginInterceptor implements HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		System.out.println("this is afterCompletion of LoginInterceptor");
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		System.out.println("this is postHandle of LoginInterceptor");
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("this is preHandle of LoginInterceptor");
		HttpSession session=request.getSession();
		User user=(User)session.getAttribute("user");
		if(user==null){
			System.out.println("no user in LoginInterceptor!!!");
			request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
			//本次访问被拦截，业务逻辑不继续执行
			return false;
		}	
		//返回true代表继续往下执行
		return true;
	}

}
