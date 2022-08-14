package com.xinghao.test;

import com.xinghao.pojo.Users;
import com.xinghao.service.UsersService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void testUsers(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_service.xml");
        UsersService uService = (UsersService) ac.getBean("usersServiceImpl");
        int num = uService.insert(new Users(100,"xinghao","123"));
        System.out.println(num);
    }
}
