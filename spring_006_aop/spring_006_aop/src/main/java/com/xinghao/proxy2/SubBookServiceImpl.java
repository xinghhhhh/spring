package com.xinghao.proxy2;

//子类就是代理类，将父类的图书购买功能添加事务切面
public class SubBookServiceImpl extends BookServiceImpl{
    @Override
    public void buy() {
        try {
            //事务切面
            System.out.println("事务开启....");
            //主业务实现
            super.buy();

            //事务切面
            System.out.println("事务提交....");
        } catch (Exception e) {
            System.out.println("事务回滚.....");
        }
    }
}
