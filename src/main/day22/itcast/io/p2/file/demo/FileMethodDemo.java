package main.day22.itcast.io.p2.file.demo;
/*
*@author  zhangyufeng
*@data 2018/11/8 下午2:56
*/

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileMethodDemo {

    public static void main( String[] args ) throws ParseException {

        		/*
		 * File对象的常见方法。
		 *
		 * 1，获取。
		 * 		1.1 获取文件名称。
		 * 		1.2 获取文件路径。
		 * 		1.3 获取文件大小。
		 * 		1.4 获取文件修改时间。
		 *
		 * 2，创建与删除。
		 *
		 * 3，判断。
		 *
		 * 4， 重命名
		 *
		 */
		getDemo();
    }

    public static void getDemo() throws ParseException {
//        File file = new File("/Users/mac/Documents/didi@workspace/Jichu/demo.txt");
        File file = new File("demo.txt");

        String name = file.getName(); //获取文件名
        String path = file.getPath(); //获取文件相对路径
        String abspath = file.getAbsolutePath();  //获取文件绝对路径
        long len = file.length();   //获取文件大小

        long time = file.lastModified();   //获取最后修改时间
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str_time = sdf.format(time);
        Date date = sdf.parse(str_time);



        System.out.println("name : " + name);
        System.out.println("path : " + path);
        System.out.println("abspath : " + abspath);
        System.out.println("len : " + len);
        System.out.println("str_time  : " + date);

    }
}
