package com.liqi.observer.normal;

public class UseClient {
    public static void main(String[] args) {

        // 创建接入方
        CurrentCondition condition = new CurrentCondition();
        WeatherData weatherData = new WeatherData(condition);
        // 更新天气数据
        weatherData.setData(36f,40f,150f);
        System.out.println("数据更新了");
        // 天气情况变化
        weatherData.setData(38f,49f,300f);

    }
}
