package com.zxkj.observe.springDemo;

import com.zxkj.observe.springDemo.event.ContextStartedEvent;
import com.zxkj.observe.springDemo.listener.SpringStartListener;
import com.zxkj.observe.springDemo.multicaster.AbstractApplicationEventMulticaster;
import com.zxkj.observe.springDemo.multicaster.SimpleApplicationEventMulticaster;
import com.zxkj.observe.springDemo.source.ApplicationContextImpl;

public class Main {

    public static void main(String[] args) {
        AbstractApplicationEventMulticaster multicaster = new SimpleApplicationEventMulticaster();

        multicaster.addApplicationListener(new SpringStartListener());

        multicaster.multicastEvent(new ContextStartedEvent(new ApplicationContextImpl()));

    }
}
