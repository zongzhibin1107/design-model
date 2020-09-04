package com.liqi.observer.design;

import java.util.ArrayList;
import java.util.List;

public class WeathData implements Subject {

    // 温度
    private float temperature;
    // 湿度
    private float humidity;
    // 大气压力
    private float pressure;
    // 观察者集合
    private List<Observer> observers;

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public WeathData(){
        observers = new ArrayList<>();
    }

    public void setData(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }

    @Override
    public void resgisterObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if(observers.contains(observer)){
            observers.remove(observer);
        }
    }

    // 遍历 通知
    @Override
    public void notifyObservers() {
        for (Observer observer : this.observers) {
            observer.update(getTemperature(),getHumidity(),getPressure());
        }
    }
}
