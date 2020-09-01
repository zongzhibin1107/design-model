package com.zxkj.observe.bellEvent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//目标类：事件源，铃
public class BellEventSource {

    private List<BellEventListener> listener;

    public BellEventSource()
    {
        listener=new ArrayList<BellEventListener>();
    }

    public void addPersonListener(BellEventListener ren)
    {
        listener.add(ren);
    }


    public void ring(boolean sound)
    {
        String type=sound?"上课铃":"下课铃";
        System.out.println(type+"响！");
        RingEvent event=new RingEvent(this, sound);
        notifies(event);    //通知注册在该事件源上的所有监听器
    }

    protected void notifies(RingEvent e)
    {
        BellEventListener ren=null;
        Iterator<BellEventListener> iterator=listener.iterator();
        while(iterator.hasNext())
        {
            ren=iterator.next();
            ren.heardBell(e);
        }
    }
}
