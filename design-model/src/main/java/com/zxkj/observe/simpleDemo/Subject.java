package com.zxkj.observe.simpleDemo;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    public List<Observer> observers = new ArrayList<>();



    public void add(Observer observer){
        observers.add(observer);
    }

    public void remove(Observer observer){
        observers.remove(observer);
    }

    public abstract void notifyObserver();
}
