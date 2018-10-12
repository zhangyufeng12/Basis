package main.day11;
/*
*@author  zhangyufeng
*@data 2018/6/27 上午10:26
*/


/*

Object:所有类的根类。

Object是不断抽取而来，具备着所有对象都具备的共性内容。

常用的共性功能：

*/

/*
class Fu // extends Object
{
	Fu()
	{
		super();
	}
}
class Zi extends Fu
{
	Zi()
	{
		super();
	}
}
*/


import com.sun.deploy.net.HttpRequest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;


class Person  extends Object{
    private int age;
    Person(int age){
        this.age =age;
    }
    /*
	//比较Person的年龄。是否是同龄人
	public boolean compare(Person p)
	{
		return this.age == p.age;
	}
	*/



/*
	一般都会覆盖此方法（equals），根据对象的特有内容，建立判断对象是否相同的依据。
	*/
public boolean  equals(Object obj){ //Object obj = p2
    if (!(obj instanceof Person)){
      //  return false;
        throw  new ClassCastException("类型错误");
    }
    Person p = (Person)obj;  //向下转型   p = obj =p2
    return this.age ==p.age;    //this.age为调用者的age 即 p1    return  p1==p2

 }
}
class Demo7
{

}


public class ObjectDemo {
    public static void main(String[] args)
    {
        Person p1 =new Person(20);
        Person p2 =new Person(20);
        Demo7 d = new Demo7();
        System.out.println(p1.equals(p2));

        Class class1 =p1.getClass();
        Class class2 = p2.getClass();
        System.out.println(class1==class2);

        System.out.println(p1.toString());

    }
}
