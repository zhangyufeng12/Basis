package main.day22.itcast.io.p1.transstream.demo;
/*
*@author  zhangyufeng
*@data 2018/11/1 下午2:14
*/

import java.io.IOException;
import java.io.InputStream;

public class ReadKey {

    public static void main( String[] args ) throws IOException {

//		System.out.println(int)'\r');
//		System.out.println((int)'\n');

        readkey2();
    }


    /*
		 * 获取用户键盘录入的数据，
		 * 并将数据变成大写显示在控制台上，
		 * 如果用户输入的是over，结束键盘录入。
		 *
		 * 思路：
		 * 1，因为键盘录入只读取一个字节，要判断是否是over，需要将读取到的字节拼成字符串。
		 * 2，那就需要一个容器。StringBuilder.
		 * 3，在用户回车之前将录入的数据变成字符串判断即可。
		 *
		 */
    public static void readkey2() throws IOException {

        //1，创建容器。
        StringBuilder sb = new StringBuilder();
        //2，获取键盘读取流。
        InputStream in = System.in;
        //3，定义变量记录读取到的字节，并循环获取。
        int ch =0 ;

        while ((ch=in.read())!=-1){
//			在存储之前需要判断是否是换行标记 ,因为换行标记不存储。
            if(ch=='\r'){
                continue;
            }
            if(ch=='\n'){
                String temp = sb.toString();
                if(temp.equals("over")){
                    break;
                }
                System.out.println(temp.toUpperCase()); //转成大写
                sb.delete(0, sb.length());  //清空缓存区
            }
            else
                //将读取到的字节存储到StringBuilder中。
                sb.append((char)ch);
//            	System.out.println(ch);
        }
    }

    public static void readkey() throws IOException {

        InputStream in = System.in;

        int ch = in.read();
        System.out.println(ch);

        int ch1 = in.read();//阻塞式方法。
        System.out.println(ch1);
        int ch2 = in.read();//阻塞式方法。
        System.out.println(ch2);

//		in.close();

//		InputStream in2 = System.in;
//		int ch3 = in2.read();
    }
}
