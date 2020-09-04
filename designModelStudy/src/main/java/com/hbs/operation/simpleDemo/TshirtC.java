package com.hbs.operation.simpleDemo;

/**
 * @author lusong
 * @date 2020/9/4 - 10:15
 */
public class TshirtC extends Decorator{

    public TshirtC(Person person) {
        super(person);
    }

    @Override
    public void show() {
        super.show();
        wearTshirt();
    }
    public void wearTshirt(){
        System.out.println("穿上了t恤");
    }
}
