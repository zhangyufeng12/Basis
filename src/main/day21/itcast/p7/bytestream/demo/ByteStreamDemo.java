package main.day21.itcast.p7.bytestream.demo;
/*
*@author  zhangyufeng
*@data 2018/10/29 下午12:46
*/


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {

    public static void main( String[] args ) throws IOException {

        byte_read();
    }

    private static void byte_read() throws IOException {
        FileInputStream fis = new FileInputStream("bytedemo.txt");

//        System.out.println(fis.available());//字节数

        byte[] buf = new byte[fis.available()];
        fis.read(buf);
        System.out.println(new String(buf));


      /*  byte[] buf = new byte[1024];
        int len = 0;
        while ((len=fis.read(buf))!=-1){
            System.out.println(new String(buf,0,len));
        }*/

       /* int ch = 0;
        while ((ch=fis.read())!=-1){
            System.out.println((char) ch);
        }*/

       /* //一次读取一个字节
        int ch = fis.read();
        System.out.println(ch);
*/
        fis.close();
    }

    private static void byte_write() throws IOException {
        FileOutputStream fos = new FileOutputStream("bytedemo.txt");
        fos.write("abcdef".getBytes());
//        fos.flush();
        fos.close();
    }
}
