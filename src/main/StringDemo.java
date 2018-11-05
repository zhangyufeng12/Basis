package main;
/*
*@author  zhangyufeng
*@data 2018/10/25 下午5:03
*/

public class StringDemo {

    public static void main( String[] args ) {

        String str = "abc,aa,abc,aa,aa";
        String sub1="abc";
        String sub2="aa";
        int count1=0;
        int count2=0;

        //记录线索
        int index=0;
        while (true){
            if (str.indexOf(sub1,index)==-1){
                break;
            }else {
                //计数
                count1++;
                //重新计算索引位置
                index=index+sub1.length();
            }
        }
        System.out.println(sub1+"出现次数为"+count1);

        int index1=0;
        while (true){
            if (str.indexOf(sub2,index1)==-1){
                break;
            }else {
                count2++;
                index1=index1+sub2.length();
            }
        }

        System.out.println(sub2+"出现次数为"+count2);

        if(count1>count2){
            System.out.println(sub1);
        }if(count1<count2) {System.out.println(sub2);}
        else System.out.println(sub1+"and"+sub2);
}
}