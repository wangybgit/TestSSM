package com.wyb.test;
import javax.annotation.Resource;  

import org.apache.log4j.Logger;  
import org.junit.Test;  
import org.junit.runner.RunWith;  
import org.springframework.test.context.ContextConfiguration;  
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;  
  
import com.alibaba.fastjson.JSON;
import com.wyb.domain.User;
import com.wyb.service.IUserService;  

  
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
  
public class TestMyBatis {  
    private static Logger logger = Logger.getLogger(TestMyBatis.class);  
//  private ApplicationContext ac = null;  
    @Resource  
    private  IUserService userService = null;  
  
//  @Before  
//  public void before() {  
//      ac = new ClassPathXmlApplicationContext("applicationContext.xml");  
//      userService = (IUserService) ac.getBean("userService");  
//  }  
  
    @Test  
    public void test1() {  
        User user = userService.getUserById(1);  
        System.out.println(user.getUserName());  
        logger.info("值："+user.getUserName());  
    	
//    	User user1=new User();
//    	user1.setAge(10);
//    	user1.setPassword("1111");
//    	user1.setUserName("rose");
//    	int t=userService.insert(user1);
//    	logger.info("Test success:"+t);  
    	
        logger.info(JSON.toJSONString(user));  

    }  
    

}  