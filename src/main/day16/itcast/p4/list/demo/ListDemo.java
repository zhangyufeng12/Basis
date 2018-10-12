package main.day16.itcast.p4.list.demo;
/*
*@author  zhangyufeng
*@data 2018/8/9 下午5:48
*/

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    public static void main( String[] args ) {

        List list = new ArrayList();
        show(list);
    }

    private static void show( List list ) {
        //添加元素
        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
        System.out.println(list);

        //插入元素。
        list.add(2,"abc8");
        System.out.println(list);

        //修改元素
        list.set(1,"abc5");
        System.out.println(list);

        //获取元素
        System.out.println("get:"+ list.get(2));

        //获取子列表
        System.out.println("sublist:"+list.subList(1,3));
    }
}
