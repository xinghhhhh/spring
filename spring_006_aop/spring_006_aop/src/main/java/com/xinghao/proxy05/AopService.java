package com.xinghao.proxy05;

public interface AopService {
    default void before(){};
    default void after(){};
    default void exception(){};
}
