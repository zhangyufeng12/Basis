package main.day18.itcast.p8.treemap.demo;
/*
*@author  zhangyufeng
*@data 2018/8/30 下午5:21
*/

import main.day18.itcast.p2.bean.Student;
import main.day18.itcast.p3.comparator.ComparatorByName;

import java.util.*;

public class TreeMapDemo {

    public static void main( String[] args ) {
 /*
        * 将学生对象和学生归属地 通过键与值存储到map集合中
        * */

        TreeMap<Student,String> tm = new TreeMap<Student,String>(new ComparatorByName());

        tm.put(new Student("zhangsan",24),"北京");
        tm.put(new Student("lisi",25),"上海");
        tm.put(new Student("xiaoqiang",31),"广州");
        tm.put(new Student("zhaoliu",28),"大连");
        tm.put(new Student("lisi",25),"沈阳");


        Iterator<Map.Entry<Student,String>> it=  tm.entrySet().iterator();

        while (it.hasNext()){
            Map.Entry<Student,String> entry =it.next();
            Student key = entry.getKey();
            String value =entry.getValue();
            System.out.println(key.getName()+":"+key.getAge()+"----"+value);
        }

}
}
