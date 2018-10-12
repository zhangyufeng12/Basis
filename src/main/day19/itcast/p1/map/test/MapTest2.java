package main.day19.itcast.p1.map.test;
/*
*@author  zhangyufeng
*@data 2018/9/5 上午10:32
*/

import java.util.HashMap;
import java.util.Map;

public class MapTest2 {

    public static void main( String[] args ) {

        String week = getWeek(1);
        System.out.println(week);

        System.out.println(getWeekMap(week));

    }

    public static String getWeekMap( String week ) {
        Map<String,String> map =new HashMap<String, String>();

        map.put("星期一","Mon");
        map.put("星期二","Tus");
        map.put("星期三","Wes");
        map.put("星期日","Sun");
        map.put("星期天","Sun");

        return map.get(week);
    }

    public static String getWeek( int week) {
        if (week<1 || week>7){
            throw new RuntimeException("没有对应星期");
        }
        String[] weeks ={"","星期一","星期二"};
        return weeks[week];
    }
}
