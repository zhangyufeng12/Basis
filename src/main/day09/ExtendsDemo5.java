package main.day09;
class Fu{
    Fu(){
        super();
        show();
        return;
        }
        void show(){
        System.out.println("fu show");
    }
}

class Zi extends Fu{
    int num =8;
    Zi(){
        super();
        System.out.println("构造函数输出"+ num);
        return;
    }
    void show(){
        System.out.println("子方法输出" + num);
    }

}


public class ExtendsDemo5 {
    public static void main(String[] augs){
        Zi z = new Zi();
        z.show();
    }

}
