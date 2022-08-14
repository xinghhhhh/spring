package com.xinghao.test;


import com.xinghao.pojo2.School;
import com.xinghao.pojo2.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest2 {



    @Test
    public void testSchoolSpring(){
        //由spring去创建对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("s02/applicationContext.xml");
        School school =(School) ac.getBean("school");
        System.out.println(school);
    }


    @Test
    public void testStudentSpring(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("s02/applicationContext.xml");
        Student  student =(Student) ac.getBean("stu");
        System.out.println(student);
    }

}
