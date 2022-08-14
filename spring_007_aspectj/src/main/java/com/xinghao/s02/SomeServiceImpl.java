package com.xinghao.s02;

import org.springframework.stereotype.Service;

@Service
public class SomeServiceImpl implements SomeService{
    @Override
    public String doSome(String name, int age) {
        System.out.println("doSome业务方法被执行！！！");
        return "abcd";
    }

    @Override
    public Student change() {
        System.out.println("chang()方法被执行！！！！！");
        return new Student("xinghao");
    }
}
