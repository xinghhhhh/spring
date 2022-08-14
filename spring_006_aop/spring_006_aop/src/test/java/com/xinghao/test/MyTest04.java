package com.xinghao.test;

import com.xinghao.proxy04.*;
import org.junit.Test;

public class MyTest04 {

    @Test
    public void test04(){

        WorkService agent =new Agent(new BookServiceImpl(),new LogServiceImpl());
        agent.buy();
    }

    //实现包裹多层切面功能
    @Test
    public void test044(){
        WorkService agent =new Agent(new BookServiceImpl(),new LogServiceImpl());
        WorkService agent1 = new Agent(agent,new TransServiceImpl());
        agent1.buy();
    }
}
