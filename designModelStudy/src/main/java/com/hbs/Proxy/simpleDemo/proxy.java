package com.hbs.Proxy.simpleDemo;

/**
 * @author lusong
 * @date 2020/9/4 - 9:31
 */
public class proxy implements Subject{

    private realSubject realSubject;
    @Override
    public void request() {
        if(realSubject == null){
            realSubject = new realSubject();
        }
        preRequest();
        realSubject.request();
        postRequest();
    }

    public void preRequest()
    {
        System.out.println("代理执行方法之前的处理。");
    }
    public void postRequest()
    {
        System.out.println("代理执行方法之后的处理。");
    }
}
