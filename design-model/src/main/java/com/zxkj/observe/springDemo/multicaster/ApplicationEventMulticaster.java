package com.zxkj.observe.springDemo.multicaster;


import com.zxkj.observe.springDemo.event.ApplicationEvent;
import com.zxkj.observe.springDemo.listener.ApplicationListener;

/**
 * 定义多播器  的一些基本方法
 */
public interface ApplicationEventMulticaster {


    void addApplicationListener(ApplicationListener<?> listener);

    void removeApplicationListener(ApplicationListener<?> listener);


    void multicastEvent(ApplicationEvent event);
}
