package main.day09;

/*
* 继承的弊端：打破了封装性
* */

/*
* final关键字：
* 1.final是一个修饰符，可以修饰方法  类  变量
* 2.final修饰的类不可以被继承
* 3.final修饰的方法不可被覆盖
* */
class  Fu2{

    /*final*/ void method(){
        //调用了底层系统的资源
    }
}

class Zi2 extends Fu2{
    void method(){
        System.out.println("test1");
    }
}



public class FinalDemo {
    public static void main(String[] args){
        System.out.println("hello world");

        Zi2 zi2 =new Zi2();
        zi2.method();
    }
}
