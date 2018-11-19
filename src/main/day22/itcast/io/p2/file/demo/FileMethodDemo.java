package main.day22.itcast.io.p2.file.demo;
/*
*@author  zhangyufeng
*@data 2018/11/8 下午2:56
*/

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileMethodDemo {

    public static void main( String[] args ) throws ParseException, IOException {

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
		 *      boolean
		 * 3，判断。
		 *
		 * 4， 重命名
		 *
		 */


//		    getDemo();
//        createAndDeleteDemo();
//        isDemo();
//        renameToDemo();
        listRootsDemo();
    }

    public static void listRootsDemo() {
        File file = new File("/Users/mac/Documents");

        System.out.println("getFreeSpace:"+file.getFreeSpace());  //获取空余空间
        System.out.println("getTotalSpace:"+file.getTotalSpace());  //总容量
        System.out.println("getUsableSpace:"+file.getUsableSpace());  //可用字节数

//		File[] files  = File.listRoots();
//		for(File file : files){
//			System.out.println(file);
//		}
    }

    public static void renameToDemo() {
        File f1 = new File("c:\\9.mp3");

        File f2 = new File("d:\\aa.mp3");

        boolean b = f1.renameTo(f2);

        System.out.println("b="+b);
    }

    public static void isDemo() throws IOException {
        File f = new File("aaa");

//		f.mkdir();
        f.createNewFile();

//		boolean b = f.exists();
//		System.out.println("b="+b);
        // 最好先判断是否存在。
        System.out.println(f.isFile());

        System.out.println(f.isDirectory());

    }

    public static void createAndDeleteDemo() throws IOException {

        //创建文件夹
        File dir = new File("abc\\aa\\bb");

//        boolean b = dir.mkdir();
//        System.out.println(b);

        //创建多级目录
        dir.mkdirs();
        System.out.println(dir.delete());


        //		文件的创建和删除。
//        File file = new File("file.txt");
        /*
        * 和输出流不一样 如果文件不存在则创建，如果文件存在，则不创建
        *
        * */
        //创建
//        boolean b = file.createNewFile();
//        System.out.println("b= "+ b);
        //删除
//        boolean del = file.delete();
//        System.out.println("del = " +del);
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
