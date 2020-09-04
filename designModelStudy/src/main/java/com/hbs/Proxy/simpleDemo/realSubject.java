package com.hbs.Proxy.simpleDemo;

/**
 * @author lusong
 * @date 2020/9/4 - 9:29
 */
public class realSubject implements Subject{
    @Override
    public void request() {
        System.out.println("真正执行方法...");
    }
}
