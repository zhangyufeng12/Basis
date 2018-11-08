package main.day22.itcast.io.p1.transstream.demo;
/*
*@author  zhangyufeng
*@data 2018/11/7 下午7:10
*/

import java.io.*;

public class TransStreamDemo3 {

    public static void main( String[] args ) throws IOException {

        readText_2();
    }

    public static void readText_2() throws IOException {
        InputStreamReader isr =  new InputStreamReader(new FileInputStream("gbk.txt"),"utf-8");

        char[] buf = new char[10];
        int len = isr.read(buf);
        String str = new String(buf,0,len);
        System.out.println(str);

        isr.close();
    }

    public static void readText_1() throws IOException {
        FileReader fr=new FileReader("gbk.txt");

        char[] buff= new char[10];
        int len = fr.read(buff);
        String str = new String(buff,0,len);
        System.out.println(str);
        fr.close();
    }

    public static void writeText_3() throws IOException {
        OutputStreamWriter ows= new OutputStreamWriter(new FileOutputStream("ut8.txt"),"utf-8");
        ows.write("你好");
        ows.close();
    }

    public static void writeText_2() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("gbk.txt"),"GBK");
        //		FileWriter fw = new FileWriter("gbk_1.txt");

        /*
		 * 这两句代码的功能是等同的。
		 * FileWriter：其实就是转换流指定了本机默认码表的体现。而且这个转换流的子类对象，可以方便操作文本文件。
		 *             简单说：操作文件的字节流+本机默认的编码表。
		 * 				这是按照默认码表来操作文件的便捷类。
		 *
		 * 如果操作文本文件需要明确具体的编码。FileWriter就不行了。必须用转换流。
		 *
		 */

        osw.write("你好");
        osw.close();
    }

    public static void writeText_1() throws IOException {
        FileWriter fw = new FileWriter("gbk.txt");
        fw.write("你好");
        fw.close();
    }
}
