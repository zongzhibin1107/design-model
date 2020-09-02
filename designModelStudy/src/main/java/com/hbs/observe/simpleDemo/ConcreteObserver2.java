package com.hbs.observe.simpleDemo;

public class ConcreteObserver2 implements Observer {

    @Override
    public void response() {
        System.out.println("观察者2实现方法！");
    }
}
