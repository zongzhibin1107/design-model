package com.zxkj.observe.springDemo.multicaster;


import com.zxkj.observe.springDemo.event.ApplicationEvent;
import com.zxkj.observe.springDemo.event.ContextStartedEvent;
import com.zxkj.observe.springDemo.listener.ApplicationListener;

public class SimpleApplicationEventMulticaster extends AbstractApplicationEventMulticaster {


    @Override
    public void multicastEvent(ApplicationEvent event) {
        for (ApplicationListener listener :listeners){
            listener.onApplicationEvent(event);
        }
    }

}
