package main.day19.itcast.p2.comparator;
/*
*@author  zhangyufeng
*@data 2018/9/5 下午5:56
*/

import java.util.Comparator;

public class ComparatorByLenght implements Comparator<String>{


    @Override
    public int compare( String o1, String o2 ) {

        int temp = o1.length()-o2.length();

        return temp==0?o1.compareTo(o2):temp;
    }
}
