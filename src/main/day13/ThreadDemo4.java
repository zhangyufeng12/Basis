package main.day13;
/*
*@author  zhangyufeng
*@data 2018/7/6 下午5:46
*/

/*
* notify()  唤醒
* */

class Demo implements Runnable {
    public void run() {
        show();
    }

    public void show() {
        for (int x = 0; x < 10; x++) {
            System.out.println(Thread.currentThread().getName() +"........." +x);
        }
    }
}

public class ThreadDemo4 {

    public static void main( String[] args ) {
        Demo d =new Demo();

        Thread t1 =new Thread(d);
        Thread t2 = new Thread(d);

        t1.start();
        t2.start();
    }
}
