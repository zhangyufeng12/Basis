package main.day14;
/*
*@author  zhangyufeng
*@data 2018/7/18 下午1:08
*/

/*
生产者，消费者。

*多生产者，多消费者的问题。

if判断标记，只有一次，会导致不该运行的线程运行了。出现了数据错误的情况。
while判断标记，解决了线程获取执行权后，是否要运行！

notify:只能唤醒一个线程，如果本方唤醒了本方，没有意义。而且while判断标记+notify会导致死锁。
notifyAll解决了本方线程一定会唤醒对方线程的问题。
*/

class Resource5
{
    private String name;
    private int count = 1;
    private boolean flag = false;

    public synchronized void set(String name)
    {
        while (flag)
        {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.name =name;
        count++;
        System.out.println(Thread.currentThread().getName()+"...生产者..."+this.name+count);
        flag=true;
        this.notifyAll();
    }

    public synchronized void out()
    {
        while (!flag)
        {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName()+"...消费者..."+this.name+count);
        flag = false;
        this.notifyAll();
    }
}

class Producer implements Runnable
{
    Resource5 r;
    Producer(Resource5 r)
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
class Consumer implements Runnable
{
    Resource5 r;
    Consumer(Resource5 r)
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

public class ProducerConsumerDemo {

    public static void main( String[] args ) {

        Resource5 r5 = new Resource5();
        Producer p = new Producer(r5);
        Consumer c = new Consumer(r5);

        Thread t0  = new Thread(p);
        Thread t1  = new Thread(p);
        Thread t2  = new Thread(c);
        Thread t3  = new Thread(c);

        t0.start();
        t1.start();
        t2.start();
        t3.start();
    }
}
