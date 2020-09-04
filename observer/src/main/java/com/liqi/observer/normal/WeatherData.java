package com.liqi.observer.normal;

public class WeatherData {

    // 温度
    private float temperature;
    // 湿度
    private float humidity;
    // 大气压力
    private float pressure;

    private CurrentCondition condition;

    public WeatherData(CurrentCondition condition) {
        this.condition = condition;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setData(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        dataChange();
    }

    private void dataChange() {
        this.condition.update(getTemperature(),getHumidity(),getPressure());
    }

}
