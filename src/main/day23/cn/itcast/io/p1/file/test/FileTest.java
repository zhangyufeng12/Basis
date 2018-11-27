package main.day23.cn.itcast.io.p1.file.test;
/*
*@author  zhangyufeng
*@data 2018/11/23 下午12:03
*/

/*
 * 需求：对指定目录进行所有内容的列出（包含子目录中的内容）
 * 也可以理解为 深度遍历。
 *
 *
 */

import java.io.File;

public class FileTest {

    public static void main( String[] args ) {

        File dir = new File("/Users/mac/Documents/java视频");

        listAll(dir,0);
    }

    public static void listAll( File dir, int level ) {

        System.out.println(getSpace(level)+dir.getName());
        //获取指定目录下当前的所有文件夹或者文件对象


        level++;
        File[] files = dir.listFiles();
        for (int x=0; x<files.length; x++){
            if(files[x].isDirectory()){
                listAll(files[x],level);
            }
            else
                System.out.println(getSpace(level)+files[x].getName());
        }

    }

    private static String getSpace( int level ) {
        StringBuilder sb = new StringBuilder();
        sb.append("|--");
        for(int x =0;x<level;x++)
            sb.insert(0,"|  ");

        return sb.toString();
    }
}
