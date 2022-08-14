package com.xinghao.proxy05;

public class BookServiceImpl implements WorkService {
    @Override
    public void buy() {
        System.out.println("图书购买业务！！！！！");
    }

    @Override
    public String show(int age) {
        System.out.println("这是show方法被调用。。。。"+age);
        return ("Waaaaaaaaaaa");
    }
}
