package main.day21.itcast.p7.bytestream.test;
/*
*@author  zhangyufeng
*@data 2018/10/30 下午3:49
*/

import java.io.*;

public class CopyMp3Test {

    public static void main( String[] args ) throws IOException {

        Copy_4();
    }

    //效率最低
    public static void Copy_4() throws IOException{
        FileInputStream fis = new FileInputStream("/Users/mac/Documents/资源/音乐/往后余生-王貮浪.mp3");
        FileOutputStream fos = new FileOutputStream("/Users/mac/Documents/1.mp3");

        int ch=0;
        while ((ch=fis.read())!=-1){
            fos.write(ch);
        }
        fis.close();
        fos.close();

    }


    //不建议。
    public static void Copy_3() throws IOException {
        FileInputStream fis = new FileInputStream("/Users/mac/Documents/资源/音乐/往后余生-王貮浪.mp3");
        FileOutputStream fos = new FileOutputStream("/Users/mac/Documents/1.mp3");

        byte[] buf = new byte[fis.available()];
        fis.read(buf);
        fos.write(buf);

        fis.close();
        fos.close();
    }

    public static void Copy_2() throws IOException {
        FileInputStream fis = new FileInputStream("/Users/mac/Documents/资源/音乐/往后余生-王貮浪.mp3");
        BufferedInputStream bis = new BufferedInputStream(fis);

        FileOutputStream fos = new FileOutputStream("/Users/mac/Documents/1.mp3");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        int ch = 0;
        while ((ch=bis.read())!=-1){
            bos.write(ch);
        }

        bis.close();
        bos.close();
    }

    public static void Copy_1() throws IOException{
        FileInputStream fis = new FileInputStream("/Users/mac/Documents/资源/音乐/往后余生-王貮浪.mp3");   //读
        FileOutputStream fos = new FileOutputStream("/Users/mac/Documents/1.mp3"); //写

        byte[] buf = new byte[1024];
        int len =0;
        while ((len=fis.read(buf))!=-1){
            fos.write(buf,0,len);
        }

        fis.close();
        fos.close();
    }
}
