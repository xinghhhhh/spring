package com.xinghao.s01;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//切面类，包含各种方法
@Aspect  //交给AspectJ框架去识别切面类
@Component
public class MyAspect {
    /**
     * 所有切面的功能都是由切面方法来实现的
     * 可以将各种切面都在此类中进行开发
     *
     * 前置通知的切面方法的规范
     * 1)访问权限是public
     * 2)方法的返回值是void
     * 3)方法名称自定义
     * 4)方法没有参数,如果有也只能是JoinPoint类型
     * 5)必须使用@Before注解来声明切入的时机是前切功能和切入点
     *   参数:value  指定切入点表达式
     *
     * 业务方法
     * public String doSome(String name, int age)
     */
    @Before(value = "execution(public String com.xinghao.s01.SomeServiceImpl.doSome(String,int))")
    public void myBefore(JoinPoint joinPoint){
        System.out.println("切面方法中的前置通知功能实现.....");
        System.out.println("目标方法的签名："+joinPoint.getSignature());
        System.out.println("目标方法的参数："+ Arrays.toString(joinPoint.getArgs()));
    }

}
