package main.day18.itcast.p1.generic.demo;
/*
*@author  zhangyufeng
*@data 2018/8/22 下午12:54
*/

import main.day18.itcast.p2.bean.Person;
import main.day18.itcast.p3.comparator.ComparatorByName;

import java.util.Iterator;
import java.util.TreeSet;

public class GenericDemo2 {

    public static void main( String[] args ) {

        TreeSet<Person> ts=new TreeSet<Person>(new ComparatorByName());
        ts.add(new Person("lisi8",21));
        ts.add(new Person("lisi3",23));
        ts.add(new Person("lisi",21));
        ts.add(new Person("lis0",20));

        Iterator<Person> it =ts.iterator();

        while (it.hasNext()){
            Person p= it.next();
            System.out.println(p.getName()+"...."+p.getAge());
        }
    }
}
