package com.xinghao.proxy04;

public interface AopService {
    default void before(){};
    default void after(){};
    default void exception(){};
}
