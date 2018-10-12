package main.day16.itcast.p2.wrapper.demo;
/*
*@author  zhangyufeng
*@data 2018/8/6 下午4:04
*/

public class WrapperDemo2 {

    public static void main( String[] args ) {

        int num =4;
        num =num +5;
        Integer i =4;//i=new Integer(3) 自动装箱  简化书写
        i=i+6; // i = new Integer(i.intValue() + 6 );  // i.intValue()   自动装箱
        System.out.println(i);

        show(55);

        Integer a =new Integer(123);
        Integer b = new Integer(123);

        System.out.println(a==b); //地址不同   false
        System.out.println(a.equals(b)); //值相同 true

        Integer x =128;
        Integer y =128;

        System.out.println(x==y); //JDK1.5后 自动装箱 如果装箱的是一个字节，那么该数据会被共享不会重新开辟空间。 如127和128是分水岭
        System.out.println(x.equals(y));
    }

    private static void show(Object a ) { //Object a =new Integer(55);
        System.out.println("a = "+a);
    }
}
