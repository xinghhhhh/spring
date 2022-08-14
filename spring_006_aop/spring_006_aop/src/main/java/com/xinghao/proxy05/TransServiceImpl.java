package com.xinghao.proxy05;

public class TransServiceImpl implements AopService {
    @Override
    public void before() {
        System.out.println("事务开启！！！");
    }

    @Override
    public void after() {
        System.out.println("事务提交！！！");
    }

    @Override
    public void exception() {
        System.out.println("事务回滚！！！");
    }
}
