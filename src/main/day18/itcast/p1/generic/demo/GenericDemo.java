package main.day18.itcast.p1.generic.demo;
/*
*@author  zhangyufeng
*@data 2018/8/21 下午12:19
*/

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo {

    public static void main( String[] args ) {
        int[] arr=new int[4];
//        arr[0] =3.0;

        ArrayList<String> al=new ArrayList<String>();

        al.add("abc");//public boolean add(Object obj)
        al.add("hahah");
//		al.add(4);//al.add(new Integer(4));
        System.out.println(al);

        Iterator<String> it= al.iterator();
        while (it.hasNext()){
//            String str =(String)it.next();
            String str =it.next();
            System.out.println(str);

        }
    }
}
