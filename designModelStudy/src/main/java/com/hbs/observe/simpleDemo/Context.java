package com.hbs.observe.simpleDemo;

/**
 * @author lusong
 * @date 2020/9/2 - 17:59
 */
public class Context {
    Observer observer;

    public Context(Observer observer) {
        this.observer = observer;
    }

    public void start(){
        observer.response();
    }
}
