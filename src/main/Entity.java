
/*
* 面向对象
* */


package main;


public class Entity {


//    //定义类就是在定义类中的成员
//    //成员：成员变量--->属性    成员函数--->行为
//    static class Car {
//        int num;
//        String color;
//
//        void run() {
//            System.out.println(num + "....." + color);
//        }
//    }
//
//    static class CarDemo {
//        public static void main(String[] args) {
//            //创建一个car实例，通过new关键字
//            Car c = new Car();   //c就是一个类类型的引用变量，指向了该类的对象
//            c.num =4;
//            c.color="red";
//
//            c.run();  //要使用对象中的内容可以通过    对象.成员 的形式来完成调用
//        }
//    }



////封装
//    static class Person{
//        //私有修饰符  是一个权限修饰符  用于修饰成员
//        //私有的内容只在本类中有效
//        //私有仅仅是封装的一种体现形式
//        private int age;
//        public void setAge(int a){
//            if(a>0  && a<130) {
//                age = a;
//                speak();
//            }else
//                System.out.println("error");
//        }
//        public int getAge(){
//            return age;
//        }
////
//        void speak(){
//            System.out.println("age="+age);
//        }
//    }
//
//   static class PersomDemo{
//        public static void main(String[] args){
//            Person p =new Person();
//            p.setAge(20);
//        }
//
//    }


    private int age;
    private String name;


    Entity(){

         name ="zhangsan";
         age=1;

    }

    Entity(String name,int age){
       // System.out.println(this.name);
        this.name=name;
        this.age=age;
    }

    public void setName(String name,int age){

        this.name=name;
        this.age=age;
    }
    void speck(){
        System.out.println(name + " is " + +age);
    }

    /*判断是否为同龄人
    * */
    public boolean compare(Entity p){

        //this为调用方法的地址 p1    p为传入的对象p2

       /* if (this.age==p.age)
            return true;
        else
            return false;
            */
       return this.age==p.age;
    }

    static class demo{
        public static void main(String[] args){
            Entity p = new Entity();
            p.speck();

            Entity p1 =new Entity("张三",18);
            Entity p2 =new Entity("aa",20);

            //p1为调用compare方法的对象  p2为传入的对象
            p1.compare(p2);


            //p1.setName("张",20);
            //p1.speck();


        }
}


}