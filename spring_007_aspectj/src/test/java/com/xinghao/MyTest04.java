package com.xinghao;

import com.xinghao.s04.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest04 {

    @Test
    public void test04(){
        ApplicationContext ac= new ClassPathXmlApplicationContext("s04/applicationContext.xml");
        SomeService someService=(SomeService) ac.getBean("someServiceImpl");
        String s = someService.doSome("xinghao",25);
        System.out.println("在后置方法中，目标方法的返回值："+s);
    }

}
