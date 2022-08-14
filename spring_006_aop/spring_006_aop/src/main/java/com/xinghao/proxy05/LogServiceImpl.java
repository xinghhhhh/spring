package com.xinghao.proxy05;

public class LogServiceImpl implements AopService {
    @Override
    public void before() {
        System.out.println("日志输出！！！");
    }


}
