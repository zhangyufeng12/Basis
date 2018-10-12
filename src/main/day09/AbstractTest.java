package main.day09;

/*
雇员示例：
需求：公司中程序员有姓名，工号，薪水，工作内容。
项目经理除了有姓名，工号，薪水，还有奖金，工作内容。
对给出需求进行数据建模。



分析：
在这个问题领域中，先找出涉及的对象。
通过名词提炼法。
程序员：
	属性：姓名，工号，薪水、
	行为：工作。
经理：
	属性：姓名，工号，薪水，奖金。
	行为：工作。


程序员和经理不存在着直接继承关系，

但是程序员和经理却具有共性内容。
可以进行抽取。因为他们都是公司的雇员

可以将程序员和经理进行抽取.建立体系.

*/

//描述雇员。
//抽取共性内容
abstract class Employee{
    private String name;
    private String id;
    private double pay;
    //构造函数初始化
    Employee(String name,String id, double pay){
        this.name=name;
        this.id=id;
        this.pay=pay;
    }
    //不能确定的工作行为
    public abstract void work();
}
//描述程序员
class Programmer extends Employee{
    Programmer(String name,String id, double pay){
        //寻找父类初始化
        super(name,id,pay);
        System.out.println(name+"...."+id+"......"+pay);
    }
    public void work(){
        System.out.println("...code...");
    }
}
//描述经理;
class Manager extends Employee{
    private int bonus;
    Manager(String name,String id, double pay,int bonus){
        //寻找父类初始化
        super(name,id,pay);
        //本类特有属性初始化
        this.bonus=bonus;
        System.out.println(name+"...."+id+"...."+pay+"...."+bonus);
    }
    public void work(){
        System.out.println("....manager....");
    }
}

public class AbstractTest {
    public static void main(String[] augs){
        Programmer p =new Programmer("zhangsan","1",100000.00);
        p.work();
        Manager m= new Manager("lisi","2",1000.00,10000);
        m.work();

    }
}
