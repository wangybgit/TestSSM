package com.wyb.interceptor;

import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequestInterceptor;

public class AllInterceptor implements WebRequestInterceptor {

	@Override
	public void afterCompletion(WebRequest arg0, Exception arg1) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(WebRequest arg0, ModelMap arg1) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void preHandle(WebRequest arg0) throws Exception {
		System.out.println("this is preHandle of AllInterceptor!");
		
	}

}
