package com.xinghao.test;

import com.xinghao.proxy2.BookServiceImpl;
import com.xinghao.proxy2.SubBookServiceImpl;
import org.junit.Test;

public class MyTest02 {
    @Test
    public void test02(){
        BookServiceImpl service = new SubBookServiceImpl();
        service.buy();
    }
}
