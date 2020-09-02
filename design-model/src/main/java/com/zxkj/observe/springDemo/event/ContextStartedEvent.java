package com.zxkj.observe.springDemo.event;


import com.zxkj.observe.springDemo.source.ApplicationContext;

/**
 * 这是具体的事件
 */
public class ContextStartedEvent extends ApplicationContextEvent {

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ContextStartedEvent(ApplicationContext source) {
        super(source);
    }
}
