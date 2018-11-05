package main.day22.itcast.io.p1.transstream.demo;
/*
*@author  zhangyufeng
*@data 2018/11/2 下午2:38
*/


/*
*   字节流转字符流
* InputStreamReader
* OutputSteamWriter
* */
import java.io.*;

public class TransStreamDemo {

    public static void main( String[] args ) throws IOException {

        //字节流
        InputStream in = System.in;
//		int ch = in.read();
//		System.out.println(ch);
//		int ch1 = in.read();
//		System.out.println(ch1);

        //字节流转换成字符流
        InputStreamReader isr= new InputStreamReader(in);

//		int ch = isr.read();
//		System.out.println((char)ch);

        //字符流。
        BufferedReader bufr = new BufferedReader(isr);

        OutputStream out = System.out;
        OutputStreamWriter osw= new OutputStreamWriter(out);
        BufferedWriter bufw = new BufferedWriter(osw);


        String line = null;
        while ((line=bufr.readLine())!=null){
            if("over".equals(line))
                break;
//			System.out.println(line.toUpperCase());
//			osw.write(line.toUpperCase()+"\r\n");
//			osw.flush();

            bufw.write(line.toUpperCase());//转大写
            bufw.newLine();//换行
            bufw.flush();//刷新

        }

    }
}
