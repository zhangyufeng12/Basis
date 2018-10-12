package main.day17.tcast.p5.comparator;
/*
*@author  zhangyufeng
*@data 2018/8/19 上午10:51
*/

import main.day17.tcast.p.Person;

import java.util.Comparator;


//创建一个Person根据name比较的比较器
//Comparator 比较器
//让集合自身具备比较功能，定义一个类实现Comparator接口，覆盖compare方法。

public class ComparatorByName implements Comparator {

    public static void main( String[] args ) {

        System.out.println("Hello World");
    }

    @Override
    public int compare( Object o1, Object o2 ) {
        Person p1= (Person)o1;
        Person p2= (Person)o2;
        int temp=p1.getName().compareTo(p2.getName());


        return temp==0?p1.getAge()-p2.getAge():temp;
    }
}
