package com.xinghao.test;

import com.xinghao.controller.UsersController;
import com.xinghao.pojo.Users;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    //传统
    @Test
    public void testInsertUsers(){
        UsersController usersController = new UsersController();
        int num = usersController.insert(new Users(100,"张三",22));
        System.out.println(num);
    }

    //spring去创建
    @Test
    public void testInsertUsers_spring(){
//        创建容器并启动
        ApplicationContext ac = new ClassPathXmlApplicationContext("total.xml");
//        取出对象
        UsersController usersController = (UsersController) ac.getBean("uController");
//        测试功能
        int num = usersController.insert(new Users(200,"zhangmazi",35));
        System.out.println(num);
    }
}
