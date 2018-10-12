package main.day13;
/*
*@author  zhangyufeng
*@data 2018/7/12 下午12:14
*/


/*
死锁：常见情景之一：同步的嵌套。

*/


class Ticket4 implements Runnable{
    private int num=100;
    Object obj=new Object();
    boolean flag =true;

    @Override
    public void run() {
        if(flag) {
            while (true) {
                synchronized (obj) {
                    show();
                }
            }
        }
        else
            while (true){
            this.show();
            }
    }
    public void show(){
        synchronized (obj){
            if(num>0)
            {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+".......sale..."+num--);
            }
        }
    }
}

public class DeadLockDemo {

    public static void main( String[] args ) {

        Ticket4 ticket4 =new Ticket4();

        Thread t1 = new Thread(ticket4);
        Thread t2 = new Thread(ticket4);

        t1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ticket4.flag=false;
        t2.start();
    }
}
