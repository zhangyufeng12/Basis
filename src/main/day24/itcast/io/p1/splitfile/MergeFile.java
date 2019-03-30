package main.day24.itcast.io.p1.splitfile;
/*
*@author  zhangyufeng
*@data 2018/12/17 下午12:52
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class MergeFile {

    public static void main( String[] args ) throws IOException {

        File dir = new File("c:\\partfiles");

        mergeFile(dir);
    }

    public static void mergeFile( File dir ) throws IOException {
        ArrayList<FileInputStream> al = new ArrayList<FileInputStream>();

        for(int x=1; x<=3 ;x++){
            al.add(new FileInputStream(new File(dir,x+".part")));
        }

        Enumeration<FileInputStream> en = Collections.enumeration(al);
        SequenceInputStream sis = new SequenceInputStream(en);

        FileOutputStream fos = new FileOutputStream(new File(dir,"1.bmp"));

        byte[] buf = new byte[1024];

        int len = 0;
        while((len=sis.read(buf))!=-1){
            fos.write(buf,0,len);
        }

        fos.close();
        sis.close();

    }
}
