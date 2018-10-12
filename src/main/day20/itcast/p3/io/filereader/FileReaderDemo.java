package main.day20.itcast.p3.io.filereader;
/*
*@author  zhangyufeng
*@data 2018/10/12 下午12:52
*/


import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

    public static void main( String[] args ) throws IOException {

        //1,创建读取字符数据的流对象。
		/*
		 * 在创建读取流对象时，必须要明确被读取的文件。一定要确定该文件是存在的。
		 *
		 * 用一个读取流关联一个已存在文件。
		 */

        FileReader fr = new FileReader("demo.txt");

        int ch =0;

        while ((ch=fr.read())!=-1){
            System.out.println((char)ch);
        }

        //用Reader中的read方法读取字符。
//        int ch = fd.read();
//        System.out.println((char)ch);
//        int ch2 =fd.read();
//        System.out.println((char)ch2);

        fr.close();

    }
}
