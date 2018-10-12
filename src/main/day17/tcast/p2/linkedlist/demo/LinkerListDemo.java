package main.day17.tcast.p2.linkedlist.demo;
/*
*@author  zhangyufeng
*@data 2018/8/13 下午6:26
*/

import java.util.Iterator;
import java.util.LinkedList;

public class LinkerListDemo {

    public static void main( String[] args ) {

        LinkedList link= new LinkedList();

        link.addFirst("abc1");
        link.addFirst("abc2");  //向第一个位置插入数据
        link.addFirst("abc3");
        link.addFirst("abc4");


        System.out.println("link:"+link);
//        System.out.println(link.getFirst());  //获取第一个 但不删除
//        System.out.println(link.getFirst());

        System.out.println(link.removeFirst());//获取第一个元素  且删除
        System.out.println(link.removeFirst());

        while (!link.isEmpty()){  //link.isEmpty()判断link为空的时候
            System.out.println(link.removeFirst());
        }

        System.out.println("link:"+link);

//        Iterator it= link.listIterator();
//        while (it.hasNext())
//        {
//            System.out.println(it.next());
//        }
    }
}
