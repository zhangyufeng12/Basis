package main.day13;
/*
*@author  zhangyufeng
*@data 2018/7/11 下午12:37
*/


/*
同步函数的使用的锁是this；

同步函数和同步代码块的区别：
同步函数的锁是固定的this。

同步代码块的锁是任意的对象。

建议使用同步代码块。


*/
class Ticket1 implements Runnable//extends Thread
{
    private int num =100;
    boolean flag = true;
    Object obj= new Object();
    public void run()
    {
//        System.out.println("this:"+this);
        if(flag)
            while(true)
            {
                synchronized(this)
                {
                    if(num>0)
                    {
                        try{Thread.sleep(10);}catch (InterruptedException e){}
                        System.out.println(Thread.currentThread().getName()+".....obj...."+num--);
                    }
                }
            }
        else
            while(true)
                this.show();
    }

    public synchronized void show(){
         while(true)
    {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(num>0)
            {
                try{Thread.sleep(10);}catch (InterruptedException e){}
                System.out.println(Thread.currentThread().getName()+".....sale......."+num--);
            }

    }
}
}

public class SynFunctionLockDemo {

    public static void main( String[] args ) {

        Ticket1 t1= new Ticket1();
//        System.out.println("t1:"+t1);

        Thread tt =new Thread(t1);
        Thread ttt =new Thread(t1);

        tt.start();
        try{Thread.sleep(10);}catch (InterruptedException e){};
        t1.flag=false;
        ttt.start();
    }
}
