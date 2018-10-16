package main.day21.itcast.p2.io.charstream.buffer;
/*
*@author  zhangyufeng
*@data 2018/10/16 下午7:10
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferedReaderDemo {

    public static void main( String[] args ) throws FileNotFoundException {

        FileReader fr = new FileReader("buf.txt");

        BufferedReader br = new BufferedReader(fr);
        String line = null;


    }
}
