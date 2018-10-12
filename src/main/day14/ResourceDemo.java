package main.day14;
/*
*@author  zhangyufeng
*@data 2018/7/13 下午6:19
*/

/*
线程间通讯：
多个线程在处理同一资源，但是任务却不同。
*/

//资源
class Resource{
    String name;
    String sex;
}
//输入
class Input implements  Runnable
{
    Resource r;
    Input(Resource r){
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

        }
            x = (x + 1) % 2;
        }
    }
}

//输出
class Output implements Runnable{
    Resource r;
    Output(Resource r){
        this.r=r;
    }

    @Override
    public void run()
    {

        while (true)
        {
            synchronized(r)
            {
                System.out.println(r.name + ".........." + r.sex);
            }
        }
    }
}

public class ResourceDemo {

    public static void main( String[] args ) {

        //创建资源。
        Resource r = new Resource();
        //创建任务。
        Input in = new Input(r);
        Output out = new Output(r);
        //创建线程，执行路径。
        Thread t1 = new Thread(in);
        Thread t2 = new Thread(out);
        //开启线程
        t1.start();
        t2.start();
    }
}
