package main.day09;
/*
abstract class AbsDemo
{
	abstract void show1();
	abstract void show2();
}

当一个抽象类中的方法都是抽象的时候，这时可以将该抽象类用
另一种形式定义和表示，就是 接口 interface。
*/

//定义接口使用的关键字不是class，是interface.
/*
对于接口当中常见的成员：而且这些成员都有固定的修饰符。
1，全局常量: public  static final

2，抽象方法。public abstract

由此得出结论，接口中的成员都是公共的权限.


*/
interface A{
    public void show();
}
interface Z{
    public  int add( int a, int b );

}

class Test implements A,Z{
    public int add( int a, int b){
        //System.out.println(a+b);
        return a+b;
    }

    @Override
    public void show() {

    }
}

class Q {
    public void method(){

    }
}

// 接口的出现避免了单继承的局限性
class Test2 extends Q implements A,Z{

    @Override
    public void show() {

    }

    @Override
    public int add( int a, int b ) {
        return 0;
    }
}


interface CC
{
    void show();
}
interface MM
{
    void method();
}

interface QQ extends  CC,MM      //接口与接口之间是继承关系，而且接口可以多继承。
{
    void function();
}

class WW implements QQ
{
    //覆盖3个方法。
    public void show(){}
    public void method(){}
    public void function(){}
}





public class InterfaceDemo {
    public static void main(String[] augs){
        Test t =new Test();
        t.add(3,4);
    }
}
