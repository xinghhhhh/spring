package com.xinghao.proxy05;

import com.xinghao.proxy05.AopService;
import com.xinghao.proxy05.WorkService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    public static Object getAgent(WorkService target, AopService aopService){
        //返回生成的动态代理对象
        return Proxy.newProxyInstance(
                //类加载器
                target.getClass().getClassLoader(),
                //目标对象实现所有接口
                target.getClass().getInterfaces(),
                //代理功能实现
                new InvocationHandler() {
                    @Override
                    public Object invoke(
                            //生成的代理对象
                            Object proxy,
                            //正在被调用的目标方法buy()
                            Method method,
                            //目标方法的参数
                            Object[] args) throws Throwable {
                        Object obj = null;
                        try {
                            //切面
                            aopService.before();
                            //业务
                            obj = method.invoke(target, args);
                            //切面
                            aopService.after();
                        } catch (Exception e) {
                            //切面
                            aopService.exception();
                        }

                        return obj; //目标方法的返回值
                    }
                });
    }
}
