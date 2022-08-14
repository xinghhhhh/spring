package com.xinghao.proxy3;

//静态代理实现了目标对象的灵活切换
public class Agent implements Service{
    //设计成员变量的类型为接口，为了灵活切换目标对象
    public Service target;

    //使用构造方法传入目标对象
    public  Agent(Service service){
        this.target=service;
    }


    @Override
    public void buy() {
        try {
            //事务切面
            System.out.println("事务开启....");
            //主业务实现
            target.buy();
            //事务切面
            System.out.println("事务提交....");
        } catch (Exception e) {
            System.out.println("事务回滚.....");
        }


    }
}
