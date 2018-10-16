package main.day21.itcast.p2.io.charstream.buffer;
/*
*@author  zhangyufeng
*@data 2018/10/16 下午7:10
*/

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

    private static final String LINE_SEPARATOR = System.getProperty("line.separator");

    public static void main( String[] args ) throws IOException {

        FileWriter fw = new FileWriter("buf.txt");

        //为了提高写入的效率。使用了字符流的缓冲区。
        //创建了一个字符写入流的缓冲区对象，并和指定要被缓冲的流对象相关联
        BufferedWriter  bw = new BufferedWriter(fw);

        //使用缓冲区的写入方法将数据先写入到缓冲区中。

//        bw.write("abcde"+LINE_SEPARATOR+"haha");
//        bw.write("xxiix");
//        bw.newLine();   //换行
//        bw.write("oooo");

        for(int x=1;x<4;x++){
            bw.write("abcdef"+x);
            bw.newLine();
            bw.flush();
        }
        //使用缓冲区的刷新方法将数据刷目的地中。
//		bufw.flush();


        //关闭缓冲区。其实关闭的就是被缓冲的流对象。
        bw.close();

    }
}
