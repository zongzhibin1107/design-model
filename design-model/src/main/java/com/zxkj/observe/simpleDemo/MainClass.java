package com.zxkj.observe.simpleDemo;


public class MainClass {

    public static void main(String[] args) {
        Subject subject= new ContreteSubject();
        ConcreteObserver1 concreteObserver1 = new ConcreteObserver1();
        ConcreteObserver2 concreteObserver2 = new ConcreteObserver2();

        subject.add(concreteObserver1);
        subject.add(concreteObserver2);

        subject.notifyObserver();

    }
}
