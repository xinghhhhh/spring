package com.xinghao.test;

import com.xinghao.s02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest2 {

    @Test
    public void testStudent(){
        //创建容器对象并启动
        ApplicationContext ac = new ClassPathXmlApplicationContext("s02/applicationContext.xml");

        Student student = (Student) ac.getBean("student");
        System.out.println(student);
    }


}
