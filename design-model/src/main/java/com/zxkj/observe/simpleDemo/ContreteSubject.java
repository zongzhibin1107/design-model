package com.zxkj.observe.simpleDemo;

public class ContreteSubject extends Subject {


    @Override
    public void notifyObserver() {
        System.out.println("具体目标发生改变...");
        System.out.println("--------------");

        for(Object obj:observers){
            ((Observer)obj).response();
        }
    }
}
