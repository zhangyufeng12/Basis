package main.day14;
/*
*@author  zhangyufeng
*@data 2018/7/19 下午5:15
*/

/*
* 线程停止：
* 1.stop方法
*
* 2.run方法结束
*
* 怎么控制线程的任务结束？
*任务中都会有循环结构，只要控制住循环就可以结束任务
*
* 控制循环通常就用定义标记来完成
*
* 但是如果线程处于冻结状态，无法读取标记  如何结束？
*可以使用interrupt()方法将线程从冻结状态强制恢复到运行状态中来，让线程具备cpu的执行资格
*
* 但是强制动作会发生中断异常InterruptedException，需要处理
* */
class StopThread implements Runnable
{
    private boolean flag = true;
    public synchronized void run()
    {
        while (flag)
        {
            try {
                wait(); //t1 t2
            }catch (InterruptedException e)
            {
                System.out.println(Thread.currentThread().getName()+"........"+e);
                flag=false;
            }
            System.out.println(Thread.currentThread().getName()+"........+++++");
        }
    }
    public void setFlag()
    {
        flag =false;
    }
}

public class StopThreadDemo {

    public static void main( String[] args ) {

       StopThread st=new StopThread();

       Thread t1 =new Thread(st);
       Thread t2 =new Thread(st);

       t1.start();
       t2.start();

       int num =1;

       for(;;)
       {
           if(++num==50)
           {
//               st.setFlag();
               t1.interrupt();
               t2.interrupt();
               break;
           }
           System.out.println("main......"+num);
       }

        System.out.println("over");
    }
}
