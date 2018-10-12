package main.day11;
/*
*@author  zhangyufeng
*@data 2018/7/2 下午4:18
*/

public class test_try {

    public static void main( String[] args ) {
        try {
            System.out.println("Hello World");
            return;
        }
        finally {
            System.out.println("111");
        }
    }
}
