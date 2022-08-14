package com.xinghao.proxy04;

public class Agent implements WorkService{
    WorkService target;
    AopService aop;

    public Agent(WorkService target, AopService aop) {
        this.target = target;
        this.aop = aop;
    }

    @Override
    public void buy() {
        try {
            aop.before();
            target.buy();
            aop.after();
        } catch (Exception e) {
            aop.exception();
        }
    }

}
