package com.xinghao.service.impl;

import com.xinghao.dao.UsersMapper;
import com.xinghao.dao.UsersMapperImpl;
import com.xinghao.pojo.Users;
import com.xinghao.service.UsersService;

//业务逻辑层的实现类
public class UsersServiceImpl implements UsersService {

    //切记：在所有的业务逻辑层中都必定有数据访问层的对象
    private UsersMapper usersMapper = new UsersMapperImpl();


    public int insert(Users users) {
        //可以添加业务在此
        return usersMapper.insert(users);
    }
}
