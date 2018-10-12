package main.day19.itcast.p1.map.demo;
/*
*@author  zhangyufeng
*@data 2018/9/5 上午10:40
*/


import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

    public static void main( String[] args ) {

        File f=null;

        HashMap<Integer,String> hm= new LinkedHashMap<Integer, String>();
        hm.put(7, "zhouqi");
        hm.put(3, "zhangsan");
        hm.put(1, "qianyi");
        hm.put(5, "wangwu");

        Iterator<Map.Entry<Integer,String>> it = hm.entrySet().iterator();

        while (it.hasNext()){
            Map.Entry<Integer,String> me= it.next();
            Integer key = me.getKey();
            String value = me.getValue();

            System.out.println(key+":"+value);
        }
    }
}
