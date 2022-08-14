package com.xinghao.proxy05;

public interface WorkService {
    void buy();
    //增加有参有返回值的方法测试代理功能
    default String show(int age){return null;};
}
