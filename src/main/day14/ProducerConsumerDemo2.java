package main.day14;
/*
jdk1.5以后将同步和锁封装成了对象。
并将操作锁的隐式方式定义到了该对象中，
将隐式动作变成了显示动作。

Lock接口： 出现替代了同步代码块或者同步函数。将同步的隐式锁操作变成现实锁操作。
同时更为灵活。可以一个锁上加上多组监视器。
lock():获取锁。
unlock():释放锁，通常需要定义finally代码块中。


Condition接口：出现替代了Object中的wait notify notifyAll方法。
			将这些监视器方法单独进行了封装，变成Condition监视器对象。
			可以任意锁进行组合。
await();
signal();
signalAll();



*/

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
*@author  zhangyufeng
*@data 2018/7/19 下午12:38
*/
class Resource6
{
    private String name;
    private int count = 1;
    private boolean flag = false;

    //	创建一个锁对象。
    Lock lock =new ReentrantLock();

    //通过已有的锁获取该锁上的监视器对象。
//	Condition con = lock.newCondition();

    //通过已有的锁获取两组监视器，一组监视生产者，一组监视消费者。
    Condition producer_con = lock.newCondition();
    Condition consumer_con = lock.newCondition();

    public  void set(String name)
    {
        lock.lock();
        try {
            while (flag)
            {
                try {
                    producer_con.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            this.name =name;
            count++;
            System.out.println(Thread.currentThread().getName()+"...生产者..."+this.name+count);
            flag=true;
//            notifyAll();
            consumer_con.signal();
        }
        finally {
            lock.unlock();
        }
    }

    public  void out()
    {
        lock.lock();
        try {
            while (!flag)
            {
                try {
                    consumer_con.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName()+"...消费者..."+this.name+count);
            flag = false;
//          notifyAll();
            producer_con.signal();

        }
        finally {
            lock.unlock();
        }
        }

}

class Producer1 implements Runnable
{
    Resource6 r;
    Producer1(Resource6 r)
    {
        this.r=r;
    }
    @Override
    public void run() {
        while (true)
        {
            r.set("哈哈");
        }
    }
}
class Consumer1 implements Runnable
{
    Resource6 r;
    Consumer1(Resource6 r)
    {
        this.r=r;
    }
    @Override
    public void run()
    {
        while (true)
        {
            r.out();
        }
    }
}


public class ProducerConsumerDemo2 {

    public static void main( String[] args ) {
        Resource6 r= new Resource6();
        Producer1  p1= new Producer1(r);
        Consumer1 con1 = new Consumer1(r);

        Thread t0 = new Thread(p1);
        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(con1);
        Thread t3 = new Thread(con1);
        t0.start();
        t1.start();
        t2.start();
        t3.start();
    }
}
