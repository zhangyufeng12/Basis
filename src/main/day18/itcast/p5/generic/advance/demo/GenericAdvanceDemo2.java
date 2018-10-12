package main.day18.itcast.p5.generic.advance.demo;
/*
*@author  zhangyufeng
*@data 2018/8/23 下午6:04
*/

import main.day18.itcast.p2.bean.Person;
import main.day18.itcast.p2.bean.Student;
import main.day18.itcast.p2.bean.Worker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class GenericAdvanceDemo2 {

    public static void main( String[] args ) {

        ArrayList<Worker> al= new ArrayList<Worker>();

        al.add(new Worker("avx",30));
        al.add(new Worker("avx4",34));

        ArrayList<Student> al2= new ArrayList<Student>();

        al2.add(new Student("stu1",11));
        al2.add(new Student("stu2",22));


        ArrayList<String> al3= new ArrayList<String>();

        al3.add("123");
        al3.add("stu2");


        ArrayList<Person> al4= new ArrayList<Person>();

        al4.add(new Person("avx",30));
        al4.add(new Person("avx4",34));

//        printCollection(al);
        printCollection(al2);
//        printCollection(al3);
        printCollection(al4);
    }

    /*
    * 迭代并打印集合中的元素
    *
    *   可以对类型进行限定：
    *   ? extends E :接收E类型或者E的子类型对象    上限！
    *
    *   ？super E : 接收E类型或者E的父类型。下限！
    *
    *
    * */

    /*private static void printCollection( Collection<? extends Person> al ) {
        Iterator<? extends Person> it = al.iterator();
        while (it.hasNext()){
//            T str= it.next();
//            System.out.println(str);
//            System.out.println(it.next());
            Person p= it.next();
            System.out.println(p.getName()+":"+p.getAge());
        }
    }
*/
    private static void printCollection( Collection<? super Student> al ) {
        Iterator<? super Student> it = al.iterator();
        while (it.hasNext()){

            System.out.println(it.next());
        }
    }


}
