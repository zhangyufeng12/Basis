package main.day17.tcast.p5.comparator;
/*
*@author  zhangyufeng
*@data 2018/8/19 上午11:23
*/

import main.day17.tcast.p.Person;

import java.util.Comparator;

public class ComparatorByLength implements Comparator {

    public static void main( String[] args ) {

    }

    @Override
    public int compare( Object o1, Object o2 ) {
        String s1=(String)o1;
        String s2=(String)o2;

        int temp = s1.length()-s2.length();
        return temp==0?s1.compareTo(s2):temp;
    }
}
