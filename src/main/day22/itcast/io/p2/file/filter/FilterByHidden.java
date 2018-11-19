package main.day22.itcast.io.p2.file.filter;
/*
*@author  zhangyufeng
*@data 2018/11/19 下午1:02
*/

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class FilterByHidden implements FileFilter{


    //非隐藏

    @Override
    public boolean accept( File pathname ) {
        return !pathname.isHidden();
    }
}
