package main.day21.itcast.p6.io.charstream.linenumber;
/*
*@author  zhangyufeng
*@data 2018/10/26 下午1:01
*/

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineNumberReaderDemo {

    public static void main( String[] args ) throws IOException {

        FileReader fr= new FileReader("demo.txt");

        //实现行数
        LineNumberReader lr = new LineNumberReader(fr);

        String line  =null;
        lr.setLineNumber(10);//设置从第几行开始

        while ((line=lr.readLine())!=null){
            System.out.println(lr.getLineNumber()+":"+line);
        }
    }
}
