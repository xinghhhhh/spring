package com.xinghao.s02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class School {
    @Value("北京大学")
    private String name;
    @Value("北京")
    private String address;

    public School() {
        System.out.println("school的无参构造！");
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
