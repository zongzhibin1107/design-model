package com.hbs.operation.simpleDemo;

/**
 * @author lusong
 * @date 2020/9/4 - 10:13
 */
public class Decorator implements Person{
    Person person;

    public Decorator(Person person) {
        this.person = person;
    }

    @Override
    public void show() {
        person.show();
    }
}
