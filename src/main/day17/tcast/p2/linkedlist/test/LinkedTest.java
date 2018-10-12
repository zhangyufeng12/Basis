package main.day17.tcast.p2.linkedlist.test;
/*
*@author  zhangyufeng
*@data 2018/8/13 下午6:36
*/

/*
* 请使用LinkedList来模拟一个堆栈或者队列数据结构
*
* 堆栈：先进后出 First In Last Out  FILO
*
* 队列：First In First Out FIFO
*
* 我们应该描述这样一个容器，给使用提供一个容器对象完成这两种结构中的一种。
*
* */
public class LinkedTest {

    public static void main( String[] args ) {
        DuiLie dl=new DuiLie();

        dl.myAdd("abc1");
        dl.myAdd("abc2");
        dl.myAdd("abc3");
        dl.myAdd("abc4");

        while (!dl.isNull())
        {
            System.out.println(dl.myGet());
        }

    }
}