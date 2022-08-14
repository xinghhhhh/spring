package com.xinghao.test;

import com.xinghao.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void testStudent(){
        //由程序员创建
        Student student = new Student();
        System.out.println(student);
    }

    @Test
    public void testStudentSpring(){
        //由spring去创建对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("s01/applicationContext.xml");
        Student student =(Student) ac.getBean("stu");
        System.out.println(student);
    }

}
