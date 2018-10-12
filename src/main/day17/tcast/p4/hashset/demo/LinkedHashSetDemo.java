package main.day17.tcast.p4.hashset.demo;
/*
*@author  zhangyufeng
*@data 2018/8/18 上午12:20
*/

import main.day17.tcast.p.Person;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main( String[] args ) {

        HashSet hs= new LinkedHashSet();

        hs.add("hahah");
        hs.add("hehe");
        hs.add("heihei");
        hs.add("xixii");
		hs.add("hehe");


        Iterator it = hs.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
