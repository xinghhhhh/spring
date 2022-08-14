package com.xinghao.s03;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
    /**
     * 环绕通知方法的规范
     * 1)访问权限是public
     * 2)切面方法有返回值,此返回值就是目标方法的返回值
     * 3)方法名称自定义
     * 4)方法有参数,此参数就是目标方法
     * 5)回避异常Throwable
     * 6)使用@Around注解声明是环绕通知
     *   参数:
     *      value:指定切入点表达式
     */

    @Around(value = "execution(* com.xinghao.s03.*.*(..))")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        //前切功能实现
        System.out.println("环绕通知中的前置功能实现............");
        //目标方法调用
        Object obj = pjp.proceed(pjp.getArgs());
        //后切功能实现
        System.out.println("环绕通知中的后置功能实现............");
        return obj.toString().toUpperCase();  //改变了目标方法的返回值
    }
}
