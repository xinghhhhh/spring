package com.xinghao.test;

import com.xinghao.proxy05.LogServiceImpl;
import com.xinghao.proxy05.WorkService;
import com.xinghao.proxy05.ProxyFactory;
import com.xinghao.proxy05.BookServiceImpl;
import org.junit.Test;

public class MyTest05 {

    @Test
    public void test05(){
        //得到动态代理对象
        WorkService agent = (WorkService) ProxyFactory.getAgent(new BookServiceImpl(),new LogServiceImpl());
        agent.buy();
    }


    @Test
    public void test05_1(){
        //得到动态代理对象
        WorkService agent = (WorkService) ProxyFactory.getAgent(new BookServiceImpl(),new LogServiceImpl());
        String s = agent.show(333);
    }
}
