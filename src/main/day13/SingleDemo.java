package main.day13;
/*
*@author  zhangyufeng
*@data 2018/7/11 下午1:00
*/

/*
* 多线程下的单例
* */

//饿汉式

class Single{
    private static final Single s =new Single();
    private Single(){}
    public static Single getInstance(){
        return s;
    }
}

//饿汉式

class Single1{
    private static  Single1 s1= null;
    private Single1(){}
    public static Single1 getInstance()
    {
        if (s1 == null)
        {
            synchronized (Single1.class)
            {
                if (s1 == null)
                    s1 = new Single1();

            }
        }
        return s1;
    }
}


public class SingleDemo {

    public static void main( String[] args ) {



    }
}
