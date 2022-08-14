package com.xinghao.test;


import com.xinghao.pojo3.School;
import com.xinghao.pojo3.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest4 {
    @Test
    public void testStudent(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("s03/applicationContext.xml");
        Student student =(Student) ac.getBean("stu");
        System.out.println(student);
    }

    @Test
    public void testStuSequence(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("s03/applicationContext.xml");
        Student student =(Student) ac.getBean("stuSequence");
        System.out.println(student);
    }
}
