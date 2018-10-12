package main.day17.tcast.p2.linkedlist.test;
/*
*@author  zhangyufeng
*@data 2018/8/14 上午10:27
*/

import java.util.LinkedList;

public class DuiLie {
    private LinkedList link;

    public DuiLie(){
        link=new LinkedList();
    }

    public void myAdd(Object obj){
        link.addLast(obj);
    }

    public Object myGet()
    {
        return link.removeFirst();
    }
    public boolean isNull(){
        return link.isEmpty();
    }

}
