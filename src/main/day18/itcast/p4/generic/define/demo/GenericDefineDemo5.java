package main.day18.itcast.p4.generic.define.demo;
/*
*@author  zhangyufeng
*@data 2018/8/23 下午5:00
*/

public class GenericDefineDemo5 {

    public static void main( String[] args ) {

        InterImpl in= new InterImpl();
        in.show("qweqew");

        InterImpl2<Integer> in2 = new InterImpl2<Integer>();
        in2.show(5);
    }

    //泛型接口，将泛型定义在接口上
    interface Inter<T>{
        public void show(T t);
    }

    static class InterImpl2<Q> implements  Inter<Q>
    {

        @Override
        public void show( Q q ) {
            System.out.println("show :"+q);
        }
    }

    static class InterImpl implements Inter<String>
    {

        @Override
        public void show( String s ) {
            System.out.println("show  "+s);
        }
    }
}
