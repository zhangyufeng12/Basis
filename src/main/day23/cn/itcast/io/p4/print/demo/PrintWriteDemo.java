package main.day23.cn.itcast.io.p4.print.demo;
/*
*@author  zhangyufeng
*@data 2018/12/6 下午12:14
*/


import java.io.*;

public class PrintWriteDemo {

    public static void main( String[] args ) throws IOException {

        /*
            PrintWriter  字符打印流
            构造函数参数：
                1.字符串路径
                2.File对象
                3.字节输出流
                4字符输出流
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new FileWriter("out.txt"),true);

        String line = null;
        while ((line=br.readLine())!=null){
            if ("over".equals(line)){
                break;
            }
            out.println(line.toUpperCase());
            out.flush();

        }
        out.close();
        br.close();


    }
}
