package main.day20.itcast.p1.otherapi.system;
/*
*@author  zhangyufeng
*@data 2018/10/2 下午4:20
*/

import java.util.Random;

public class MathDemo {

    public static void main( String[] args ) {

        /*
            Math：提供了操作数学运算方式，都是静态的

            常用方法：
                ceil();  返回大于参数的最小整数
                floor(); 返回小于参数的最小整数
                round(); 返回四舍五入的整数
                pow(a,b):a的b次方
                random():  double类型，0.0至1.0之间的随机数
         */
//        double d1 = Math.ceil(12.59);
//        double d2 = Math.floor(12.59);
//        double d3 = Math.round(12.59);
//
//        sop("d1="+d1);
//        sop("d2="+d2);
//        sop("d3="+d3);
//
//        double d = Math.pow(10,2);
//        sop("d="+ d);

        Random r = new Random();
        for(int i =0;i<10;i++) {
//            double random = Math.ceil(Math.random()*10+1);
//            double random = (int)(Math.random()*6+1);
//            double random = (int)r.nextDouble()*6+1;
            int random = r.nextInt(6)+1;
            sop("random=" + random);
        }
    }

    public static void sop( String s ) {
        System.out.println(s);
    }
}
