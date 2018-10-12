package main.day14;
/*
*@author  zhangyufeng
*@data 2018/7/18 下午12:20
*/

//资源
class Resource3
{
    private String name;
    private String sex;
    private boolean flag=false;
    //封装
    public synchronized void set(String name,String sex)
    {
        if(flag)
        {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        this.name=name;
        this.sex=sex;
        flag=true;
        notify();
    }
    public synchronized void out()
    {
        if(!flag)
        {
            try {
                this.wait();
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        System.out.println(name+"...+...."+sex);
        flag = false;
        notify();
    }
}



//输入
class  Input3 implements Runnable
{
    Resource3 r;
    Input3(Resource3 r)
    {
        this.r =r;
    }
    @Override
    public void run()
    {
        int x = 0;
        while(true)
        {
            if(x==0)
            {
                r.set("mike","nan");
            }
            else
            {
                r.set("丽丽","女女女女女女");
            }
            x = (x+1)%2;
        }
    }
}

//输出
class Output3 implements Runnable
{
    Resource3 r;
    Output3(Resource3 r)
    {
        this.r =r;
    }
    @Override
    public void run() {
        while (true)
        {
            r.out();
        }
    }
}

public class ResourceDemo3 {

    public static void main( String[] args ) {

       Resource3 r= new Resource3();
       Input3 in3 = new Input3(r);
       Output3 out3 = new Output3(r);


       Thread t1 =new Thread(in3);
       Thread t2 =new Thread(out3);

       t1.start();
       t2.start();


    }
}
