package main.day15.p1.string.demo;
/*
*@author  zhangyufeng
*@data 2018/7/27 上午11:55
*/
/*
 * 4，模拟一个trim功能一致的方法。去除字符串两端的空白
 * 思路：
 * 1，定义两个变量。
 * 一个变量作为从头开始判断字符串空格的角标。不断++。
 * 一个变量作为从尾开始判断字符串空格的角标。不断--。
 * 2,判断到不是空格为止，
 *
 *
 * 1.2 根据位置获取字符
   char  charAT（int index）

   获取字符串中一部分字符串。也叫子串.
* 	String substring(int beginIndex, int endIndex)//包含begin 不包含end 。
* 	String substring(int beginIndex);
*/
public class StringTest_4 {

    public static void main( String[] args ) {
        String s = "    ab   c     ";

        s = myTrim(s);
        System.out.println("-" + s + "-");
    }

    public static String myTrim( String s ) {
        int start = 0, end = s.length() - 1;
        while (s.charAt(start)==' '&&start<=end){
            start++;
        }
        while (s.charAt(end)==' '&&start<=end)
        {
            end--;
        }
        return s.substring(start,end+1);
    }
}
