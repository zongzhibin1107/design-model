package com.zxkj.observe.springDemo.event;

import java.util.EventObject;

/**
 * 事件的顶层
 */
public abstract  class ApplicationEvent  extends EventObject {

    private static final long serialVersionUID = 7099057708183571937L;
    private final long timestamp;



    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ApplicationEvent(Object source) {
        super(source);
        this.timestamp = System.currentTimeMillis();
    }



    public final long getTimestamp() {
        return this.timestamp;
    }


}
