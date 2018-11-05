package main.day22.itcast.io.p1.transstream.demo;
/*
*@author  zhangyufeng
*@data 2018/11/2 下午2:38
*/


//TransStreamDemo简写方式
import java.io.*;

public class TransStreamDemo2 {

    public static void main( String[] args ) throws IOException {


        /*
		 * 1,需求：将键盘录入的数据写入到一个文件中。
		 *  BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(a.txt));
		 *
		 * 2,需求：将一个文本文件内容显示在控制台上。
		 *  BufferedReader bufr = new BufferedReader(new InputStreamReader(a.txt));
            BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));
		 *
		 * 3,需求：将一个文件文件中的内容复制到的另一个文件中。
		 *  BufferedReader bufr = new BufferedReader(new InputStreamReader(a.txt));
            BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(b.txt));
		 *
		 */

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
