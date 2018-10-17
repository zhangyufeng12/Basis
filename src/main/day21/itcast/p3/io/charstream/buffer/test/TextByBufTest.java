package main.day21.itcast.p3.io.charstream.buffer.test;
/*
*@author  zhangyufeng
*@data 2018/10/17 下午5:07
*/

import java.io.*;

public class TextByBufTest {

    public static void main( String[] args ) throws IOException {

        FileReader fr = new FileReader("demo.txt");

        BufferedReader bufr = new BufferedReader(fr);

        FileWriter fw = new FileWriter("demo_copy.txt");
        BufferedWriter bufw = new BufferedWriter(fw);

        String line = null;
        while ((line=bufr.readLine())!=null){
            bufw.write(line);
            bufw.newLine();
            bufw.flush();
        }
        /*int ch =0 ;

        while ((ch=bufr.read())!=-1){
            bufw.write(ch);
        }
        */
        bufw.close();
        bufr.close();
    }
}
