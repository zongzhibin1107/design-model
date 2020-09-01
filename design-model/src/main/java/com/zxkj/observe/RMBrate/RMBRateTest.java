package com.zxkj.observe.RMBrate;

public class RMBRateTest {

    public static void main(String[] args) {

        Rate rate=new RMBrate();
        Company watcher1=new ImportCompany();
        Company watcher2=new ExportCompany();
        rate.add(watcher1);
        rate.add(watcher2);
        rate.change(10);
        System.out.println("-------------------------------------");
        rate.change(-9);
    }
}
