package main.day17.tcast.p1.vector.demo;
/*
*@author  zhangyufeng
*@data 2018/8/13 下午6:07
*/

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

    public static void main( String[] args ) {

        Vector vector =new Vector();

        vector.addElement("abc1");
        vector.addElement("abc2");
        vector.addElement("abc3");
        vector.addElement("abc4");

        Enumeration en=vector.elements();

        while (en.hasMoreElements()){
            System.out.println("nextElement："+en.nextElement());
        }

        Iterator it= vector.iterator();
        while (it.hasNext()){
            System.out.println("next:"+it.next());
        }
    }
}
