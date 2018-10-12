package main.day11;



class Demo5{
    public int show(int index) throws ArrayIndexOutOfBoundsException
    {
        int[] arr=new int[3];

        if(index<0){
         throw new ArrayIndexOutOfBoundsException("越界了");
        }

        return arr[index];
    }
}
public class ExceptionDemo5 {
    public static void main(String[] args) {
        Demo5 d = new Demo5();

        try {
            d.show(-3);
        }
        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e.toString());
            e.printStackTrace();
            return;
//            System.exit(0);  //退出JVM
        }
        finally {//通常用于关闭（释放）资源
            System.out.println("finally");
        }
        System.out.println("over");
    }
}




/*
try catch finally 代码块组合特点：

1，
try catch finally

2,
try catch(多个)当没有必要资源需要释放时，可以不用定义finally。

3,
try finally 异常无法直接catch处理，但是资源需要关闭。


void show()throws Exception
{
	try
	{
		//开启资源。
		throw new Exception();
	}
	finally
	{
		//关闭资源。

	}


	/*
	catch(Exception e)
	{

	}
	*/

