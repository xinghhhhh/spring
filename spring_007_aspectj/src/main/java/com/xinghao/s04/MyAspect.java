package com.xinghao.s04;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
    /**
     * 最终通知方法的规范
     * 1)访问权限是public
     * 2)方法没有返回值
     * 3)方法名称自定义
     * 4)方法没有参数,如果有也只能是JoinPoint
     * 5)使用@After注解表明是最终通知
     *   参数:
     *     value:指定切入点表达式
     */

    @After(value = "execution(* com.xinghao.s04.*.*(..))")
    public void myAfter() {
        System.out.println("最终通知功能实现............");
    }


    @Before(value = "execution(* com.xinghao.s04.*.*(..))")
    public void myBefore() {
        System.out.println("前置通知功能实现............");
    }
    @Before(value = "execution(* com.xinghao.s04.*.*(..))")
    public void myBefore111() {
        System.out.println("前置通知功能实现............1111");
    }


    @AfterReturning(value = "execution(* com.xinghao.s04.*.*(..))",returning = "obj")
    public void myAfterReturning(Object obj) {
        System.out.println("后置通知功能实现............");
    }


    @Around(value = "myCut()")  //使用切入点表达式的别名
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println("环绕通知中前置功能实现............");
        Object obj = pjp.proceed(pjp.getArgs());
        System.out.println("环绕通知中后置功能实现............");
        return obj;
    }

    //为切入点表达式起别名
    @Pointcut(value = "execution(* com.xinghao.s04.*.*(..))")
    public void myCut(){
    }
}
