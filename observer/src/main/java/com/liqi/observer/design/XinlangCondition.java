package com.liqi.observer.design;

public class XinlangCondition implements Observer{
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
        System.out.println("****新浪 temperature: "+temperature);
        System.out.println("****新浪 humidity: "+humidity);
        System.out.println("****新浪 pressure: "+pressure);
    }
}
