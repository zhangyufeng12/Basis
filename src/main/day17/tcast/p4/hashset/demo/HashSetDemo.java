package main.day17.tcast.p4.hashset.demo;
/*
*@author  zhangyufeng
*@data 2018/8/15 下午4:45
*/

import java.util.HashSet;
import java.util.Iterator;

//Set:元素不可以重复，是无序。
/*
* |--HashSet: 内部数据结构是哈希表 ，是不同步的。
		如何保证该集合的元素唯一性呢？
		是通过对象的hashCode和equals方法来完成对象唯一性的。
		如果对象的hashCode值不同，那么不用判断equals方法，就直接存储到哈希表中。
		如果对象的hashCode值相同，那么要再次判断对象的equals方法是否为true。
		如果为true，视为相同元素，不存。如果为false，那么视为不同元素，就进行存储。

		记住：如果元素要存储到HashSet集合中，必须覆盖hashCode方法和equals方法。
		一般情况下，如果定义的类会产生很多对象，比如人，学生，书，通常都需要覆盖equals，hashCode方法。
		建立对象判断是否相同的依据。

* */
public class HashSetDemo {

    public static void main( String[] args ) {

        HashSet hashSet = new HashSet();

        hashSet.add("abc1");
        hashSet.add("abc2");
        hashSet.add("abc3");
        hashSet.add("abc1");

        Iterator it=hashSet.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
