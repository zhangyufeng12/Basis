package main.day13;
/*
*@author  zhangyufeng
*@data 2018/7/12 下午12:22
*/


//死锁

class Test implements Runnable
{
    private boolean flag;
    Test(boolean flag)
    {
        this.flag = flag;
    }

    public void run()
    {

        if(flag)
        {
            while(true)
                synchronized(MyLock.locka)
                {
                    System.out.println(Thread.currentThread().getName()+"..if   locka....");
                    synchronized(MyLock.lockb)				{

                        System.out.println(Thread.currentThread().getName()+"..if   lockb....");
                    }
                }
        }
        else
        {
            while(true)
                synchronized(MyLock.lockb)
                {
                    System.out.println(Thread.currentThread().getName()+"..else  lockb....");
                    synchronized(MyLock.locka)
                    {
                        System.out.println(Thread.currentThread().getName()+"..else   locka....");
                    }
                }
        }

    }

}

class MyLock
{
    //定义两个锁
    public static final Object locka = new Object();
    public static final Object lockb = new Object();
}



public class DeadLockTest {

    public static void main( String[] args ) {

        Test a = new Test(true);
        Test b = new Test(false);

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        t1.start();
        t2.start();
    }
}
