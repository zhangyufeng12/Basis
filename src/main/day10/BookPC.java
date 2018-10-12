package main.day10;

/*
笔记本电脑使用。
为了扩展笔记本的功能，但日后出现什么功能设备不知道。

定义一个规则，只要日后出现的设备都符合这个规则就可以了。
规则在java中就是接口。

*/

interface USB{    //暴露的规则
    public void open();
    public void close();
}

//规则的实现
//这些设备和电脑的耦合性降低了。

class Upan implements USB{

    @Override
    public void open() {
        System.out.println("UPan  open");
    }

    @Override
    public void close() {
        System.out.println("UPan   close");
    }
}
class UsbMouse implements USB{

    @Override
    public void open() {
        System.out.println("UsbMouse  open");
    }

    @Override
    public void close() {
        System.out.println("UsbMouse   close");
    }
}

public class BookPC {
    public static void main(String[] augs){

        Upan u =new Upan();
        useUSB(u);   //  功能的扩展

        useUSB(new UsbMouse());
    }
    //使用规则
    // 场景逻辑：插入USB这些设备本身不能进行使用  需要一个 使用功能 进行调用使用
    public static void useUSB(USB u){// USB u 接口类型的引用，用于接收(指向)接口的子类对象。//USB u= new UPan();
        u.open();
        u.close();
    }
}
