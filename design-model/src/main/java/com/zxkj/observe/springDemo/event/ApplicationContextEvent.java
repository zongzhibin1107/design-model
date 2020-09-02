package com.zxkj.observe.springDemo.event;

import com.zxkj.observe.springDemo.source.ApplicationContext;

public abstract class ApplicationContextEvent extends ApplicationEvent {


    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ApplicationContextEvent(ApplicationContext source) {
        super(source);
    }


    public final ApplicationContext getApplicationContext() {
        return (ApplicationContext) getSource();
    }
}
