package main.day21.itcast.p2.io.charstream.buffer;
/*
*@author  zhangyufeng
*@data 2018/10/16 下午7:10
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

    public static void main( String[] args ) throws IOException {

        FileReader fr = new FileReader("buf.txt");

        BufferedReader br = new BufferedReader(fr);
        String line = null;
        //readline 每次读取一行  String类型
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }
//        String line1= br.readLine();
//        System.out.println(line1);
//        String line2= br.readLine();
//        System.out.println(line2);
//        String line3= br.readLine();
//        System.out.println(line3);
//        String line4= br.readLine();
//        System.out.println(line4);
        br.close();
//        demo();
    }

    public static void demo() throws IOException {
        FileReader fr = new FileReader("buf.txt");
        char[] ch =new char[1024];

        int len = 0;
        while ((len=fr.read(ch))!=-1){
            System.out.println(ch);
        }
        fr.close();

    }
}
