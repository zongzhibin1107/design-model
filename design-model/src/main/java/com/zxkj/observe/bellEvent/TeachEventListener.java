package com.zxkj.observe.bellEvent;

public class TeachEventListener implements BellEventListener {
    @Override
    public void heardBell(RingEvent e) {
        if(e.getSound())
        {
            System.out.println("老师上课了...");
        }
        else
        {
            System.out.println("老师下课了...");
        }
    }
}
