package com.hbs.operation.simpleDemo;

/**
 * @author lusong
 * @date 2020/9/4 - 10:15
 */
public class ShoseC extends Decorator{

    public ShoseC(Person person) {
        super(person);
    }

    @Override
    public void show() {
        super.show();
        wearShose();
    }
    public void wearShose(){
        System.out.println("穿上了鞋子");
    }
}
