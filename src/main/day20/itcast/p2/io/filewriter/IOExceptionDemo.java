package main.day20.itcast.p2.io.filewriter;
/*
*@author  zhangyufeng
*@data 2018/10/12 下午12:26
*/

import java.io.FileWriter;
import java.io.IOException;

public class IOExceptionDemo {

    private static final  String LINE_SEPARATOR = System.getProperty("line.separator");//unix系统换行符

    public static void main( String[] args ) {

        FileWriter fw = null;



        try {
            fw=new FileWriter("demo.txt",true);
            fw.write("abcqq"+LINE_SEPARATOR+"xixi");
        } catch (IOException e) {
            System.out.println(e.toString());
        }finally {
            if(fw!=null)
            try {
                fw.close();
            } catch (IOException e) {
                // code....
                throw new RuntimeException("关闭失败");
            }
        }



    }
}
