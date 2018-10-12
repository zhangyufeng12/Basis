package main.day17.tcast.p3.arraylist.test;
/*
*@author  zhangyufeng
*@data 2018/8/14 上午10:44
*/

import main.day17.tcast.p.Person;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

    public static void main( String[] args ) {
        Person p1= new Person("lisi1",21);

        ArrayList al=new ArrayList();

        al.add(p1);
        al.add(new Person("list2",22));
        al.add(new Person("list3",23));
        al.add(new Person("list4",24));

//        al.add("5");
//        al.add("5");
//        al.add("5");
//        System.out.println(al);

        Iterator it= al.iterator();
        while (it.hasNext()){
//            System.out.println(((Person)it.next()).getName() +":::"+ ((Person)it.next()).getAge());
            Person p= (Person) it.next();

            System.out.println(p.getName()+":"+ p.getAge());
        }
//		al.add(5);//al.add(new Integer(5));
    }
}
