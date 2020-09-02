package com.zxkj.observe.springDemo.listener;

import com.zxkj.observe.springDemo.event.ApplicationEvent;

import java.util.EventListener;


/**
 * 观察者顶层
 * @param <E>
 */
public interface ApplicationListener<E extends ApplicationEvent> extends EventListener {

	/**
	 * Handle an application event.
	 * @param event the event to respond to
	 */
	void onApplicationEvent(E event);

}