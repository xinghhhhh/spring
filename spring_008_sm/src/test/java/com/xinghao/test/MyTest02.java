package com.xinghao.test;

import com.xinghao.pojo.Accounts;
import com.xinghao.pojo.Users;
import com.xinghao.service.AccountsService;
import com.xinghao.service.UsersService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest02 {

    @Test
    public void testAccounts(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_service.xml");
        AccountsService accountsService = (AccountsService) ac.getBean("accountsServiceImpl");
        System.out.println(accountsService.getClass());
        int num = accountsService.save(new Accounts(202,"xinghao","账户安全"));
        System.out.println(num);
    }
}
