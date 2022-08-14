package com.xinghao.controller;

import com.xinghao.pojo.Users;
import com.xinghao.service.UsersService;
import com.xinghao.service.impl.UsersServiceImpl;

//界面层
public class UsersController {
    //如何访问业务逻辑层
    //切记：所有的界面层都有业务逻辑层的对象
    public UsersService usersService = new UsersServiceImpl();

    //界面层的功能实现，对外提供访问的功能
    public int insert(Users users){

        return usersService.insert(users);
    }
}
