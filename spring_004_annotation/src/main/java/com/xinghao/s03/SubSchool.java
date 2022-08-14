package com.xinghao.s03;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SubSchool  extends School{
    @Value("北京小学")
    private String name;
    @Value("天安门")
    private String address;

    public SubSchool() {
        System.out.println("school子类的构造方法！");
    }

    @Override
    public String toString() {
        return "SubSchool{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
