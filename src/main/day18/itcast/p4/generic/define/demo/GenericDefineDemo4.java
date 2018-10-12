package main.day18.itcast.p4.generic.define.demo;
/*
*@author  zhangyufeng
*@data 2018/8/23 下午4:55
*/

public class GenericDefineDemo4 {

    public static void main( String[] args ) {

        Tool<String> tool = new Tool<String>();

        tool.show(new Integer(4));
        tool.show("abc");
        tool.print("1qeqw");
//        tool.print(new  Integer(4));

        Tool.method("hhaa");
        Tool.method(new Integer(4));
    }
}
