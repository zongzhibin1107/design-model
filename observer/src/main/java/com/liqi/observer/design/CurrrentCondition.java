package com.liqi.observer.design;

public class CurrrentCondition implements Observer {
    // 温度
    private float temperature;
    // 湿度
    private float humidity;
    // 大气压力
    private float pressure;

    @Override
    public void update(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display(){
        System.out.println("****Today temperature: "+temperature);
        System.out.println("****Today humidity: "+humidity);
        System.out.println("****Today pressure: "+pressure);
    }
}
