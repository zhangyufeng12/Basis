package main.day22.itcast.io.p1.transstream.demo;
/*
*@author  zhangyufeng
*@data 2018/11/2 下午2:38
*/


//TransStreamDemo简写方式
import java.io.*;

public class TransStreamDemo3 {

    public static void main( String[] args ) throws IOException {


        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));


        String line = null;
        while ((line=bufr.readLine())!=null){
            if("over".equals(line))
                break;

            bufw.write(line.toUpperCase());//转大写
            bufw.newLine();//换行
            bufw.flush();//刷新

        }

    }
}
