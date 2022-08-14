package com.xinghao;

import com.xinghao.s02.SomeService;
import com.xinghao.s02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest02 {

    @Test
    public void test02(){
        ApplicationContext ac= new ClassPathXmlApplicationContext("s02/applicationContext.xml");
        SomeService someService=(SomeService) ac.getBean("someServiceImpl");
        String s = someService.doSome("xinghao",25);
        System.out.println("在后置方法中，目标方法的返回值："+s);
    }


    @Test
    public void test02_2(){
        ApplicationContext ac= new ClassPathXmlApplicationContext("s02/applicationContext.xml");
        SomeService someService=(SomeService) ac.getBean("someServiceImpl");
        Student s = someService.change();
        System.out.println("在后置方法中，目标方法的返回值："+s);
    }
}
