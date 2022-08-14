package com.xinghao.pojo2;

public class Student {
    private String name;
    private int age;

    private School school;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public Student(String name, int age, School school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    public Student() {
        System.out.println("无参构造开始！！！");
    }
}
