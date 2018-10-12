package main;

public class Static_demo {

    private static String name;

    static void speak(){
        System.out.println(name);
    }

    Static_demo(String name){
          this.name =name;
    }

    public static void main(String[] args){
        Static_demo p=new Static_demo("aaaa");
        p.speak();
    }
}
