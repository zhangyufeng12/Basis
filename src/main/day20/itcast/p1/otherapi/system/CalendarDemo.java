package main.day20.itcast.p1.otherapi.system;
/*
*@author  zhangyufeng
*@data 2018/10/10 下午4:47
*/

import java.util.Calendar;

public class CalendarDemo {

    public static void main( String[] args ) {

        Calendar c = Calendar.getInstance();

//        showDate(c);

        int year=2012;
        showDays(year);
    }

    public static void showDays( int year ) {
        Calendar c = Calendar.getInstance();
        //设置时间
        c.set(year,2,1);

        //日期偏移
        c.add(Calendar.DAY_OF_MONTH,1);

        showDate(c);
    }

    //打印当前时间
    public static void showDate( Calendar c ) {
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);
        int week = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(year+"年"+month+"月"+day+"日 "+getweek(week));
    }

    public static String getweek( int week ) {
        String[] weeks = {"","星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
        return weeks[week];
    }
}
