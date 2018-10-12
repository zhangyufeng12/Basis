package main.day14;
/*
*@author  zhangyufeng
*@data 2018/7/16 下午10:24
*/


/*
等待/唤醒机制。

涉及的方法：

1，wait(): 让线程处于冻结状态，被wait的线程会被存储到线程池中。
2，notify():唤醒线程池中一个线程(任意).
3，notifyAll():唤醒线程池中的所有线程。

这些方法都必须定义在同步中。
因为这些方法是用于操作线程状态的方法。
必须要明确到底操作的是哪个锁上的线程。


为什么操作线程的方法wait notify notifyAll定义在了Object类中？

因为这些方法是监视器的方法。监视器其实就是锁。
锁可以是任意的对象，任意的对象调用的方式一定定义在Object类中。

*/


//资源
class Resource1
{
    String name;
    String sex;
    boolean flag =false;
}
//输入
class Input1 implements  Runnable
{
    Resource1 r;
    Input1(Resource1 r)
    {
        this.r=r;
    }

    @Override
    public void run()
    {
        int x=0;

        while (true)
        {
            synchronized (r)
            {
                if(r.flag)
                    try
                    {
                        r.wait();
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                if (x == 0)
                {
                    r.name = "zhangsan";
                    r.sex = "man";
                }
                else
                {
                    r.name = "李四";
                    r.sex = "女";
                }
                r.flag=true;
                r.notify();//唤醒
            }
            x = (x + 1) % 2;
        }
    }
}

//输出
class Output1 implements Runnable{
    Resource1 r;
    Output1(Resource1 r)
    {
        this.r=r;
    }

    @Override
    public void run()
    {

        while (true)
        {
            synchronized(r)
            {
                if(!r.flag)
                    try {
                        r.wait();
                        }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                System.out.println(r.name + ".........." + r.sex);
                r.flag=false;
                r.notify(); //唤醒
            }
        }
    }
}

public class ResourceDemo2 {

    public static void main( String[] args ) {

        //创建资源。
        Resource1 r = new Resource1();
        //创建任务。
        Input1 in = new Input1(r);
        Output1 out = new Output1(r);
        //创建线程，执行路径。
        Thread t1 = new Thread(in);
        Thread t2 = new Thread(out);
        //开启线程
        t1.start();
        t2.start();
    }
}
