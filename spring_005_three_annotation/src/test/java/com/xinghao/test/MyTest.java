package com.xinghao.test;

import com.xinghao.controller.UsersController;
import com.xinghao.pojo.Users;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void testInsertUsers(){
        UsersController usersController = new UsersController();
        int num = usersController.insert(new Users(100,"张三",22));
        System.out.println(num);
    }


    //spring自动创建对象
    @Test
    public void testInsertUsers_spring(){
        //创建并启动容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
       // 取出UsersController对象
        UsersController usersController = (UsersController) ac.getBean("usersController");

        usersController.insert(new Users(100,"xinghao",22));
    }
}
