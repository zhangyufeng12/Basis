package main.day18.itcast.p7.hashmap.demo;
/*
*@author  zhangyufeng
*@data 2018/8/30 下午3:15
*/

import main.day18.itcast.p2.bean.Student;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    public static void main( String[] args ) {

        /*
        * 将学生对象和学生归属地 通过键与值存储到map集合中
        * */

        HashMap<Student,String> hm = new HashMap<Student,String>();

        hm.put(new Student("zhangsan",24),"北京");
        hm.put(new Student("lisi",25),"上海");
        hm.put(new Student("xiaoqiang",31),"广州");
        hm.put(new Student("zhaoliu",28),"大连");
        hm.put(new Student("lisi",25),"沈阳");

        Set<Student> keySet=hm.keySet();
        Iterator<Student> it= keySet.iterator();

        while (it.hasNext()){
            Student key = it.next();
            String value =hm.get(key);
            System.out.println(key.getName()+":"+key.getAge()+"----"+value);
        }
//        Set<Map.Entry<Student,String>> entrySet = hm.entrySet();
//        Iterator<Map.Entry<Student,String>> it1 = entrySet.iterator();
//
//        while (it1.hasNext()){
//            Map.Entry<Student,String> me = it1.next();
//            Student key = me.getKey();
//            String value = me.getValue();
//            System.out.println(key.getName()+":"+key.getAge()+"----"+value);
//        }


    }
}
