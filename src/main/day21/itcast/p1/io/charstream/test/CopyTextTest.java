package main.day21.itcast.p1.io.charstream.test;
/*
*@author  zhangyufeng
*@data 2018/10/15 下午12:13
*/


/*
 * 需求：作业：将c盘的一个文本文件复制到d盘。
 *
 * 思路：
 * 1，需要读取源，
 * 2，将读到的源数据写入到目的地。
 * 3，既然是操作文本数据，使用字符流。
 *
 */

import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;

public class CopyTextTest {

    public static void main( String[] args ) throws IOException {

        //1,读取一个已有的文本文件，使用字符读取流和文件相关联。
        FileReader fr= new FileReader("demo.txt");
        //2,创建一个目的，用于存储读到数据。
        FileWriter fw = new FileWriter("copytext_1.txt");
        //3,频繁的读写操作。
        int buf=0;
        while ((buf=fr.read())!=-1){
            fw.write(buf);
        }
        //4,关闭流资源。
        fr.close();
        fw.close();

    }
}
