package main.day22.itcast.io.p2.file.demo;
/*
*@author  zhangyufeng
*@data 2018/11/8 下午2:50
*/

import java.io.File;

public class FileDemo {

    public static void main( String[] args ) {

        constructorDemo();
    }

    public static void constructorDemo() {

        //可以将一个已存在的，或者不存在的文件或者目录封装成file对象。
        File file1 = new File("demo.txt");

        File file2 = new File("/Users/mac/Documents/didi@workspace/Jichu","demo.txt");

        File file = new File("/Users/mac/Documents/didi@workspace/Jichu");
        File file3 = new File(file,"demo.txt");

        File file4 = new File(File.separator+"Users"+File.separator+"mac"+File.separator+"Documents"+
                File.separator+"didi@workspace"+File.separator+"Jichu"+File.separator+"demo.txt");
        System.out.println(file4);
    }
}
