package com.xinghao.test;

import com.xinghao.proxy3.Agent;
import com.xinghao.proxy3.ProductServiceImpl;
import com.xinghao.proxy3.Service;
import org.junit.Test;

public class MyTest03 {
    @Test
    public void test03(){
        Service agent = new Agent(new ProductServiceImpl());
        agent.buy();
    }
}
