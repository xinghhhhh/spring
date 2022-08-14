package com.xinghao.test;

import com.xinghao.controller.UsersController;
import com.xinghao.pojo.Users;
import org.junit.Test;

public class MyTest {
    @Test
    public void testInsertUsers(){
        UsersController usersController = new UsersController();
        int num = usersController.insert(new Users(100,"张三",22));
        System.out.println(num);
    }
}
