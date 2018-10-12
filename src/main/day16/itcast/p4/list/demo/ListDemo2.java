package main.day16.itcast.p4.list.demo;
/*
*@author  zhangyufeng
*@data 2018/8/10 下午7:10
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo2 {

    public static void main( String[] args ) {

        List list =new ArrayList();
//        show2(list);

        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
        System.out.println("list:"+list);

   /*     Iterator it= list.iterator();
        while (it.hasNext()){
            Object obj= it.next(); //java.util.ConcurrentModificationException
            //在迭代器过程中，不要使用集合操作元素，容易出现异常。
            //可以使用Iterator接口的子接口ListIterator来完成在迭代中对元素进行更多的操作。

            if (obj.equals("abc2"))
                list.add("abc9");
            else
                System.out.println("next:"+ obj);
            System.out.println(list);
        }
*/
        ListIterator it = list.listIterator();
        while (it.hasNext()){
            Object obj=it.next();
            if (obj.equals("abc2"))
                it.set("abc9");
        }
//        System.out.println("hasNext:"+it.hasNext());
//		System.out.println("hasPrevious:"+it.hasPrevious());

        while (it.hasPrevious()){
            System.out.println("Previous:"+it.previous());
        }
        System.out.println("list:"+list);



    }
    private static void show2( List list ) {
        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
        list.add("abc4");

        Iterator it=list.iterator();
        while (it.hasNext()){
            System.out.println("next :"+ it.next());
        }
        //list特有的取出元素的方式之一。

        for (int x=0;x<list.size();x++){
            System.out.println("get:"+ list.get(x));
        }
    }
}
