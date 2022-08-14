package com.xinghao.controller;

import com.xinghao.pojo.Users;
import com.xinghao.service.UsersService;
import com.xinghao.service.impl.UsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//界面层
@Controller //交给spring去创建控制器对象
public class UsersController {
    //如何访问业务逻辑层
    //切记：所有的界面层都有业务逻辑层的对象
    @Autowired
    public UsersService usersService = new UsersServiceImpl();

    //界面层的功能实现，对外提供访问的功能
    public int insert(Users users){

        return usersService.insert(users);
    }
}
