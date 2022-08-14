package com.xinghao.dao;

import com.xinghao.pojo.Users;

//数据访问层的实现类
public class UsersMapperImpl implements UsersMapper{
    public int insert(Users users) {
        System.out.println(users.getUname()+"用户增加成功！");
        return 1;
    }
}
