package com.zxkj.observe.springDemo.listener;


import com.zxkj.observe.springDemo.event.ContextStartedEvent;
import com.zxkj.observe.springDemo.source.ApplicationContext;

/**
 * 具体的观察者
 */
public class SpringStartListener implements ApplicationListener<ContextStartedEvent> {


    @Override
    public void onApplicationEvent(ContextStartedEvent event) {
        System.out.println("----- spring application start listener------" +((ApplicationContext)event.getSource()).getApplicationName());
    }
}
