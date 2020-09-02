package com.zxkj.observe.springDemo.multicaster;

import com.zxkj.observe.springDemo.listener.ApplicationListener;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 多播器的 抽象  其他的多播器需要继承它
 */
public abstract  class AbstractApplicationEventMulticaster implements ApplicationEventMulticaster{


    public Set<ApplicationListener<?>> listeners = new LinkedHashSet<>();


    @Override
    public void addApplicationListener(ApplicationListener<?> listener) {
        listeners.add(listener);
    }

    @Override
    public void removeApplicationListener(ApplicationListener<?> listener) {
        listeners.remove(listener);
    }
}
