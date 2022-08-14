package com.xinghao.s01;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private String name;
    private int age;

    public Student() {
        System.out.println("学生对象的无参构造！");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
