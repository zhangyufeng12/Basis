package main.day18.itcast.p5.generic.advance.demo;
/*
*@author  zhangyufeng
*@data 2018/8/23 下午5:33
*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class GenericAdvanceDemo {

    public static void main( String[] args ) {

        ArrayList<String> al= new ArrayList<String>();

        al.add("abc");
        al.add("hhee");

        HashSet<Integer> al2= new HashSet<Integer>();

        al2.add(5);
        al2.add(57);


        printCollection(al);
        printCollection(al2);
    }

    /*
    * 迭代并打印集合中的元素
    * */
    private static void printCollection( Collection<?> al ) {
        Iterator<?> it = al.iterator();
        while (it.hasNext()){
//            T str= it.next();
//            System.out.println(str);
            System.out.println(it.next());
        }
    }


}
