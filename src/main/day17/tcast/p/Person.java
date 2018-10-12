package main.day17.tcast.p;
/*
*@author  zhangyufeng
*@data 2018/8/14 上午10:39
*/


//Comparable默认排序方式
//让元素自身具备比较功能，元就需要实现Comparable接口。覆盖compareTo方法。
public class Person implements Comparable /*extends Object*/ {

    private String name;
    private int age;

    public Person(String name,int age){
        this.age=age;
        this.name=name;
    }
/*
*
* 哈希表确定元素是否相同
1，判断的是两个元素的哈希值是否相同。
	如果相同，在判断两个对象的内容是否相同。

2，判断哈希值相同，其实判断的是对象的hashCode的方法。判断内容相同，用的是equals方法。

注意：如果哈希值不同，是不需要判断equals。
* */
    @Override
    public int hashCode() {
        return name.hashCode()+age*27;
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(!(obj instanceof Person))
            throw new ClassCastException("类型错误");
        Person p =(Person)obj;
        return this.name.equals(p.name)&&this.age==p.age;
    }


    public Person(){
        super();
    }
    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge( int age ) {
        this.age = age;
    }

    public String toString(){
        return name+":"+age;
    }



    /*
    * TreeSet对元素进行排序的方式一：
				让元素自身具备比较功能，元就需要实现Comparable接口。覆盖compareTo方法。
    * */
    @Override
    public int compareTo( Object o ) {
        Person p = (Person)o;

        int temp =this.age-p.age;
        return temp==0?this.name.compareTo(p.name):temp;
//        int temp = this.name.compareTo(p.name);
//        return temp==0?this.age-p.age:temp;
        /*
        if(this.age>p.age)
            return 1;
        if(this.age<p.age)
            return -1;
        else {
            return this.name.compareTo(p.name);
        }
        */
    }
}