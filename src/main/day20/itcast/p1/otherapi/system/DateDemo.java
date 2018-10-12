package main.day20.itcast.p1.otherapi.system;
/*
*@author  zhangyufeng
*@data 2018/10/8 下午2:03
*/

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

    public static void main( String[] args ) throws ParseException {

        methodDemo_2();
    }


    /**
     * 将日期格式的字符串-->日期对象。
     * 	使用的是DateFormat类中的parse()方法。
     *
     * @throws ParseException
     */

    public static void methodDemo_3() throws ParseException {
        String str_date = "2012年4月19日";
        str_date = "2011---8---17";

        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
        dateFormat = new SimpleDateFormat("yyyy---MM---dd");

        Date date = dateFormat.parse(str_date);
        System.out.println(date);
    }


    /**
     * 对日期对象进行格式化
     * 将日期对象转换成日期格式的字符串
     *      使用的是Dateformat类中的format方法
     *
     */
    public static void methodDemo_2() {

        Date date =new Date();

        //获取日期格式对象，具备默认风格  FULL  LONG等 可以指定风格
        //DateFormat 抽象类  工厂模式
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
        dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);

        // 如果风格是自定义的   如何解决？
        dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String str_date = dateFormat.format(date);

        System.out.println(str_date);


    }




    /**
     * 日期对象和毫秒值之间的转换。
     *
     * 毫秒值-->日期对象 ：
     * 	1，通过Date对象的构造方法  new Date(timeMillis);
     *  2，还可以通过setTime设置。
     *  因为可以通过Date对象的方法对该日期中的各个字段(年月日等)进行操作。
     *
     *
     * 日期对象-->毫秒值：
     * 	2，getTime方法。
     * 因为可以通过具体的数值进行运算。
     *
     *
     */
    public static void methodDemo_1() {

        long time = System.currentTimeMillis();
        System.out.println(time);     //1538978716773


        Date date =new Date();     //将当前日期和时间封装成Date对象。
        System.out.println(date);   //Mon Oct 08 14:05:53 CST 2018

        Date date1 =new Date(1538978716773l);   //将指定毫秒值封装成Date对象
        System.out.println(date1);    //Mon Oct 08 14:05:16 CST 2018


        System.out.println(date.getTime());

    }
}
