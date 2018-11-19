package main.day22.itcast.io.p2.file.filter;
/*
*@author  zhangyufeng
*@data 2018/11/19 下午1:00
*/

import java.io.File;
import java.io.FilenameFilter;

//后缀名过滤器
public class SuffixFilter implements FilenameFilter {
    private String suffix ;
    public SuffixFilter(String suffix) {
        super();
        this.suffix = suffix;
    }

    @Override
    public boolean accept( File dir, String name ) {
        return name.endsWith(suffix);
    }
}
