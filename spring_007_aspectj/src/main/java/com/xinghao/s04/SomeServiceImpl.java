package com.xinghao.s04;

import org.springframework.stereotype.Service;

@Service
public class SomeServiceImpl implements SomeService {
    @Override
    public String doSome(String name, int age) {
        System.out.println("doSome()业务方法实现！！！！" + name);
        //System.out.println(1/0);
        return "abcd";
    }
}
