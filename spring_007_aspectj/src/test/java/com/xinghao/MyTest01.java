package com.xinghao;

import com.xinghao.s01.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest01 {
    @Test
    public void test01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("s01/applicationContext.xml");
        SomeService someService = (SomeService) ac.getBean("someService");
        String s = someService.doSome("xinghao",22);
        System.out.println(s);

    }


    @Test
    public void test02(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("s01/applicationContext.xml");
        SomeService someService = (SomeService) ac.getBean("someServiceImpl");
        someService.doSome("xinghao",22);
    }

}
