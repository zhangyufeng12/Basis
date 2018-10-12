package main.day17.tcast.p4.hashset.test;
/*
*@author  zhangyufeng
*@data 2018/8/16 下午1:02
*/

/*
 * 往hashSet集合中存储Person对象。如果姓名和年龄相同，视为同一个人。视为相同元素。
 */

import main.day17.tcast.p.Person;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

    public static void main( String[] args ) {

        HashSet hs= new HashSet();
/*
		 * HashSet集合数据结构是哈希表，所以存储元素的时候，
		 * 使用的元素的hashCode方法来确定位置，如果位置相同，在通过元素的equals来确定是否相同。
		 *
		 */
        hs.add(new Person("lisi4",24));
        hs.add(new Person("lisi7",27));
        hs.add(new Person("lisi1",21));
        hs.add(new Person("lisi9",29));
        hs.add(new Person("lisi7",27));

        Iterator it= hs.iterator();
        while (it.hasNext()){
            Person p= (Person)it.next();
//            System.out.println(p);
            System.out.println(p.getName()+"........."+p.getAge());
        }
    }
}
