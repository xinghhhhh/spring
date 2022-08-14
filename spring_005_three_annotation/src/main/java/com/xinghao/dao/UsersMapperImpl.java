package com.xinghao.dao;

import com.xinghao.pojo.Users;
import org.springframework.stereotype.Repository;

//数据访问层的实现类
@Repository  //就是交给spring框架去创建数据访问层的对象
public class UsersMapperImpl implements UsersMapper{
    public int insert(Users users) {
        System.out.println(users.getUname()+"用户增加成功！");
        return 1;
    }
}
