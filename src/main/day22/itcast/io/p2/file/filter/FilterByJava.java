package main.day22.itcast.io.p2.file.filter;
/*
*@author  zhangyufeng
*@data 2018/11/19 下午12:58
*/

import java.io.File;
import java.io.FilenameFilter;

public class FilterByJava implements FilenameFilter {


    @Override
    public boolean accept( File dir, String name ) {
        return name.endsWith(".java");
    }
}
