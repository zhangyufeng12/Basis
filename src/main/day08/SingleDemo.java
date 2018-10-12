package main.day08;


/*
设计模式：对问题行之有效的解决方式。其实它是一种思想。

1,单例设计模式。
	解决的问题：就是可以保证一个类在内存中的对象唯一性。

必须对于多个程序使用同一个配置信息对象时，就需要保证该对象的唯一性。

如何保证对象唯一性呢？
1，不允许其他程序用new创建该类对象。
2，在该类创建一个本类实例。
3，对外提供一个方法让其他程序可以获取该对象。

步骤：
1，私有化该类构造函数。
2，通过new在本类中创建一个本类对象。
3，定义一个公有的方法，将创建的对象返回。



*/

//饿汉式
class  SingleObject {
    private int num;
    //创建 SingleObject 的一个对象 instance
    private static SingleObject instance =new SingleObject();

    //让构造函数为 private，这样该类就不会被实例化
    private SingleObject(){}

    //获取唯一可用的对象  用于调用
    public static SingleObject getInstance()
    {
        return instance;
    }
    public void setNum(int num)
    {
        this.num=num;
    }
    public int getNum()
    {
        return num;
    }

    public void show()
    {
        System.out.println("hello world");
    }
}

public class SingleDemo {
    public static void main(String[] args) {

    //不合法的构造函数
    //编译时错误：构造函数 SingleObject() 是不可见的 私有的
    //SingleObject object = new SingleObject();

    //获取唯一可用的对象
    SingleObject object = SingleObject.getInstance();
    SingleObject object1=SingleObject.getInstance();

    SingleObject s =SingleObject.getInstance();
    //显示消息
    object.setNum(10);
    object1.setNum(20);
    //对象唯一性  输出都为20
    System.out.println(object.getNum()+"........."+object1.getNum());

    s.show();
    }
}


