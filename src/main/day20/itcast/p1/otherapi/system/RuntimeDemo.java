package main.day20.itcast.p1.otherapi.system;
/*
*@author  zhangyufeng
*@data 2018/10/1 下午6:04
*/

import java.io.IOException;

public class RuntimeDemo {

    public static void main( String[] args ) throws IOException, InterruptedException {

        /*

            Runtime是指一个程序在运行的状态

            Runtime:没有构造方法摘要，说明该类不可以创建对象
            又发现还有非静态方法，说明该类型提供静态返回该类对象的方法
            而且只有一个，说明Runtime类使用了单例的设计模式
         */

        Runtime  runtime =Runtime.getRuntime();

        //  execute   执行
//        runtime.exec("/Users/mac/Documents/资源/资料/Charles用法.pdf");  //开启一个进程

        Process p = runtime.exec("nodepad.exe");
        Thread.sleep(5000);

        p.destroy();    //杀死一个进程



    }
}
