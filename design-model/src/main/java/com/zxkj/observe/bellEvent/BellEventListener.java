package com.zxkj.observe.bellEvent;

import java.util.EventListener;

/**
 * 抽象观察者类：铃声事件监听器
 */
public interface BellEventListener extends EventListener {

    public void heardBell(RingEvent e);
}
