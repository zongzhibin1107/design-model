package com.hbs.observe.simpleDemo;


import javax.security.auth.Subject;

public class MainClass {

    public static void main(String[] args) {

        ConcreteObserver1 concreteObserver1 = new ConcreteObserver1();
        Context context1 = new Context(concreteObserver1);
        context1.start();
        ConcreteObserver2 concreteObserver2 = new ConcreteObserver2();
        Context context2 = new Context(concreteObserver2);
        context2.start();
    }
}
