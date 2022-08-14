package com.xinghao.test;


import com.xinghao.pojo3.School;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest3 {
    @Test
    public void testScool(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("s03/applicationContext.xml");
        School school = (School) ac.getBean("school");
        System.out.println(school);
    }



}
