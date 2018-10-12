package main.day17.tcast.p5.treeset.demo;
/*
*@author  zhangyufeng
*@data 2018/8/18 上午12:23
*/

/*
*
* |--TreeSet:可以对Set集合中的元素进行排序。是不同步的。
				判断元素唯一性的方式：就是根据比较方法的返回结果是否是0，是0，就是相同元素，不存。

				TreeSet对元素进行排序的方式一：
				让元素自身具备比较功能，元就需要实现Comparable接口。覆盖compareTo方法。

				如果不要按照对象中具备的自然顺序进行排序。如果对象中不具备自然顺序。怎么办？
				可以使用TreeSet集合第二种排序方式二：
				让集合自身具备比较功能，定义一个类实现Comparator接口，覆盖compare方法。
				将该类对象作为参数传递给TreeSet集合的构造函数。

* */

import main.day17.tcast.p.Person;
import main.day17.tcast.p5.comparator.ComparatorByName;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main( String[] args ) {

        TreeSet ts = new TreeSet(new ComparatorByName());

        ts.add(new Person("zhangsan", 28));
        ts.add(new Person("lisi", 21));
        ts.add(new Person("zhouqi", 29));
        ts.add(new Person("zhaoliu", 25));
        ts.add(new Person("wangu", 24));

        Iterator it= ts.iterator();
        while (it.hasNext()){
            Person p= (Person)it.next();
            System.out.println(p.getName()+",,,,"+p.getAge());
        }
//        demo1();
    }

    public static void demo1() {
        TreeSet ts = new TreeSet();

        ts.add("abc");
        ts.add("zaa");
        ts.add("aa");
        ts.add("nba");
        ts.add("cba");

        Iterator it = ts.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}