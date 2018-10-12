package main.day18.itcast.p3.comparator;
/*
*@author  zhangyufeng
*@data 2018/8/22 下午1:08
*/

import main.day18.itcast.p2.bean.Person;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Person>{


    @Override
    public int compare( Person o1, Person o2 ) {
        int temp =o1.getName().compareTo(o2.getName());
        return temp==0?o1.getAge()-o2.getAge():temp;
    }
}
