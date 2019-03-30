package test;
/*
*@author  zhangyufeng
*@data 2018/7/24 下午4:54
*/

import main.day17.tcast.p5.comparator.ComparatorByName;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class test {

    public static void main( String[] args ) {

//        System.out.println("第五个的年龄为" + getage(5));
        mapppp();
    }

    //集合 排序遍历
    public static void mapppp(){
        Map<Integer,String> map = new TreeMap<Integer, String>();
        map.put(2,"zzz");
        map.put(5,"aaa");
        map.put(1,"dddd");
        map.put(3,"xxx");

        Iterator<Map.Entry<Integer,String>> it = map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<Integer,String>  entry = it.next();
            Integer key = entry.getKey();
            String value= entry.getValue();
            System.out.println(key+":"+value);
        }
    }

    //正则计算
    public static int getage( int num ) {
        if (num==1){
            return 10;
        }
        return 2 + getage( num-1 );

    }

}
