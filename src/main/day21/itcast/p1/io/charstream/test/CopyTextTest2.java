package main.day21.itcast.p1.io.charstream.test;
/*
*@author  zhangyufeng
*@data 2018/10/15 下午12:18
*/

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTextTest2 {

    private static final int BUFFER_SIZE =1024 ;

    public static void main( String[] args ) {

        FileWriter fw = null;
        FileReader fr = null;


        try {
            fr = new FileReader("demo.txt");
            fw = new FileWriter("copytext_2.txt");

            //创建一个临时容器，用于缓存读取到的字符。
            char[] buf = new char[BUFFER_SIZE];//这就是缓冲区。

            //定义一个变量记录读取到的字符数，(其实就是往数组里装的字符个数 )
            int len = 0;

            while ((len=fr.read(buf))!=-1){
                fw.write(buf,0,len);
            }

        } catch (IOException e) {
            throw new RuntimeException("读写失败");
        }finally {
            if(fw!=null) try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if(fr!=null) try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
