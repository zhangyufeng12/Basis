package main.day18.itcast.p2.bean;
/*
*@author  zhangyufeng
*@data 2018/8/22 下午1:11
*/

public class Student extends Person{

    public Student() {
        super();
    }

    public Student( String name, int age ) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "student:"+getName()+":"+getAge();
    }
}
