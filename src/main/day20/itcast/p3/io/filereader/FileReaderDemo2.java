package main.day20.itcast.p3.io.filereader;
/*
*@author  zhangyufeng
*@data 2018/10/12 下午12:52
*/


import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo2 {

    public static void main( String[] args ) throws IOException {



        FileReader fr = new FileReader("demo.txt");

        /**
         * 使用read(char[])读取文本文件数据
         *
         * 先创建字符数组
         *
         */

        char[] buf = new char[3];

        int len =0;
        while ((len=fr.read(buf))!=-1){
            System.out.println(new String(buf,0,len));

        }
/*
        int num = fr.read(buf);//将读取到的字符存储在数组中
        System.out.println(num + ":" + new String(buf,0,num));
        int num1 = fr.read(buf);//将读取到的字符存储在数组中
        System.out.println(num1 + ":" + new String(buf,0,num1));
        int num2 = fr.read(buf);//将读取到的字符存储在数组中
        System.out.println(num2 + ":" + new String(buf));
*/



        fr.close();

    }
}
