package main.day15.p1.string.demo;
/*
*@author  zhangyufeng
*@data 2018/7/23 下午12:05
*/

public class StringConstructorDemo {

    public static void main( String[] args ) {

        stringConstructorDemo();
        stringConstructorDemo2();

    }

    private static void stringConstructorDemo2() {
        char[] arr ={'w','a','p','q'};
        String s = new String(arr);

        System.out.println("s="+s);

    }

    private static void stringConstructorDemo() {
        String s =new String();  //等效于  String s =""

        byte[] arr = {65,66,67,68};

        String s1 =new String(arr);   //转为ASCII编码格式
        System.out.println("s1="+s1);
    }
}
