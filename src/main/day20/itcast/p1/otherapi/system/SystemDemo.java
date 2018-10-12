package main.day20.itcast.p1.otherapi.system;
/*
*@author  zhangyufeng
*@data 2018/10/1 下午4:33
*/

import java.util.Properties;
import java.util.Set;

public class SystemDemo {

    private static final String LINE_SEPARATOR = System.getProperty("line.separator");
    public static void main( String[] args ) {

        /*

        System:类中的方法和属性都是静态的

        常见方法：
            long currentTimeMillis(); 获取当前时间的毫秒值

         */
//        long L1 = 1538382939577l;  //System.currentTimeMillis();
//
//        long L2 = System.currentTimeMillis();
//        System.out.println(L2-L1);

        System.out.println("hello-"+"line.separator"+"  world");

//        demo_1();

//      给系统设置一些属性，这些信息是全局，其他程序都可以使用
//        System.setProperty("myclasspath","C:/myclass");
    }

    public static void demo_1() {
        /*
            获取系统属性信息，并存储到了Properties集合中

           Properties集合中存储的都是String类型的键和值
           最好使用它自己的存储和取出的方法来完成元素的操作
         */

        Properties properties = System.getProperties();
        Set<String> NameSet = properties.stringPropertyNames();

        for(String name  : NameSet ){
            String value =  properties.getProperty(name);

            System.out.println(name + "::" +value);
        }

    }
}
