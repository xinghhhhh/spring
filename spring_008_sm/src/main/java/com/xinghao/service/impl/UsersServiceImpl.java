package com.xinghao.service.impl;

import com.xinghao.mapper.UsersMapper;
import com.xinghao.pojo.Accounts;
import com.xinghao.pojo.Users;
import com.xinghao.service.AccountsService;
import com.xinghao.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service  //交给spring去创建对象
public class UsersServiceImpl implements UsersService {
//切记切记：在所有的业务逻辑层中一定会有数据访问层的对象
    @Autowired
    UsersMapper usersMapper;

    @Autowired
    AccountsService accountsService;

    @Override
    public int insert(Users users) {
        int num = usersMapper.insert(users);
        System.out.println("用户增加成功！！"+ num);

        //调用账户的增加，调用账户的业务逻辑层的功能
        num = accountsService.save(new Accounts(111,"hhhh","asda"));
        return num;
    }
}
