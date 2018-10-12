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
import java.util.Iterator;

public class GenericAdvanceDemo3 {

    public static void main( String[] args ) {

        ArrayList<Person> al1= new ArrayList<Person>();

        al1.add(new Person("avx",30));
        al1.add(new Person("avx4",34));


        ArrayList<Worker> al2= new ArrayList<Worker>();

        al2.add(new Worker("avx",30));
        al2.add(new Worker("avx4",34));

        ArrayList<Student> al3= new ArrayList<Student>();

        al3.add(new Student("stu1",11));
        al3.add(new Student("stu2",22));


        ArrayList<String> al4= new ArrayList<String>();

        al4.add("123");
        al4.add("stu2");

//        al1.addAll(al4); //错误  类型不匹配
        al1.addAll(al2);
        al1.addAll(al3);

        System.out.println(al1.size());





//        printCollection(al1);
//        printCollection(al2);
//        printCollection(al3);
//        printCollection(al4);
    }


    /*
 * 一般在存储元素的时候都是用上限，因为这样取出都是按照上限类型来运算的。不会出现类型安全隐患。
 *
 */
    class MyCollection<E>{
        public void add(E e)
        {

        }
        public void addAll(MyCollection<? extends E> e)
        {

        }
    }

}
