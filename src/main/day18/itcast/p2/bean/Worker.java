package main.day18.itcast.p2.bean;
/*
*@author  zhangyufeng
*@data 2018/8/22 下午1:13
*/

public class Worker extends Person{
    public Worker() {
        super();
    }

    public Worker( String name, int age ) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Worker: "+getName() +":" +getAge();
    }
}
