package main.day17.tcast.p5.treeset.test;
/*
*@author  zhangyufeng
*@data 2018/8/19 上午11:22
*/

/*
 * 对字符串进行长度排序。
 *
 * "20 18 -1 89 2 67"
 */

import main.day17.tcast.p5.comparator.ComparatorByLength;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

    public static void main( String[] args ) {
        TreeSet ts = new TreeSet(new ComparatorByLength());

        ts.add("aaaaa");
        ts.add("zz");
        ts.add("nbaq");
        ts.add("cba");
        ts.add("abc");

        Iterator it = ts.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
