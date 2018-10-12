package main.day13;
/*
*@author  zhangyufeng
*@data 2018/7/11 下午12:46
*/

/*
* 静态的同步函数使用的锁是  该函数所属字节码文件对象
* 可以用getClass方法获取   也可以用当前  类名.class表示
* */

class Ticket2 implements Runnable//extends Thread
{
    private static int num =100;
    boolean flag = true;
//    Object obj= new Object();
    public void run()
    {
//        System.out.println("this:"+this);
        if(flag)
            while(true)
            {
                synchronized(this.getClass())  //(Ticket2.class)
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

    public static synchronized void show(){
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


public class StaticSynFunctionLockDemo {

    public static void main( String[] args ) {

            Ticket2 t1= new Ticket2();
//        System.out.println("t1:"+t1);

            Thread t3 =new Thread(t1);
            Thread t4 =new Thread(t1);

            t3.start();
            try{Thread.sleep(10);}catch (InterruptedException e){};
            t1.flag=false;
            t4.start();

    }
}
