package com.xinghao.s01;

import org.springframework.stereotype.Service;

@Service
public class SomeServiceImpl implements SomeService{

    @Override
    public String doSome(String name, int age) {
        System.out.println("doSome业务功能实现！！！！");
        return "abc";
    }

    @Override
    public void show() {
        System.out.println("show方法业务实现！！！");
    }
}
