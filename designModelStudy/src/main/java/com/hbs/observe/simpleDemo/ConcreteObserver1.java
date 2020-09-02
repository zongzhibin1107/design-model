package com.hbs.observe.simpleDemo;

public class ConcreteObserver1 implements Observer {

    @Override
    public void response() {
        System.out.println("观察者1实现方法！");
    }
}
