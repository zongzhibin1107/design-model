package com.liqi.observer.design;

public class UseClient {

    public static void main(String[] args) {
        // 数据更新源
        WeathData weathData = new WeathData();
        // 观察者
        Observer current = new CurrrentCondition();
        Observer xinlang = new XinlangCondition();
        // 注册
        weathData.resgisterObserver(current);
        weathData.resgisterObserver(xinlang);
        // 数据更新
        weathData.setData(10f,30f,300f);

    }

}
