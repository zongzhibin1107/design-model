package com.hbs.operation.simpleDemo;

/**
 * @author lusong
 * @date 2020/9/4 - 10:20
 */
public class MainClass {

    public static void main(String[] args) {
        Person p = new original();

        Person p1 = new ShoseC(p);
        Person p2 = new TshirtC(p1);

        p2.show();
    }
}
