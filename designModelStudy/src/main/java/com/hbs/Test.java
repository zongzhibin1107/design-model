package com.hbs;

import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;


@Component
public class Test implements ApplicationListener<WebServerInitializedEvent> {


    @Override
    public void onApplicationEvent(WebServerInitializedEvent event) {
        System.out.println("我被执行了");
    }
}
