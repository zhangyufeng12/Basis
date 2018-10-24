package main.day21.itcast.p4.io.charstream.buffe;
/*
*@author  zhangyufeng
*@data 2018/10/22 上午11:53
*/


import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;

public class MyBufferedReaderDemo {

    public static void main( String[] args ) throws IOException {
        FileReader fr = new FileReader("demo.txt");

        MyBufferedReader bufr = new MyBufferedReader(fr);

        String line = null;

        while((line=bufr.myreadLine())!=null){
            System.out.println(line);
        }

        bufr.myClose();


//        Collections.reverseOrder();
//        HashMap map = null;
//        map.values();


    }
}
