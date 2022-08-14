package com.xinghao.dao;

import com.xinghao.pojo.Users;
import org.springframework.stereotype.Repository;

public interface UsersMapper {

    int insert(Users users);
}
