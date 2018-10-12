package main.day19.itcast.p2.toolclass.collections.demo;
/*
*@author  zhangyufeng
*@data 2018/9/5 下午5:35
*/

import main.day17.tcast.p5.comparator.ComparatorByLength;
import main.day19.itcast.p2.comparator.ComparatorByLenght;
import test.Junit_test.Calculator;

import java.util.*;

public class CollectionsDemo {

    public static void main( String[] args ) {
/*
		 * Collections：是集合框架的工具类。
		 * 里面的方法都是静态的。
		 *
		 *
		 */
        demo_4();
    }

    public static void demo_4() {
        List<String> list = new ArrayList<String>();

        list.add("abcde");
        list.add("cba");
        list.add("zhangsan");
        list.add("zhaoliu");
        list.add("xiaoqiang");

        System.out.println(list);

        // Collections.replaceAl  替换元素
        Collections.replaceAll(list, "cba", "nba"); // set(indexOf("cba"),"nba");
        System.out.println(list);


    }

    public static void demo_3() {
       	/*
		TreeSet<String> ts = new TreeSet<String>(new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {

				int temp = o2.compareTo(o1);
				return temp;
			}

		});
		*/
       	//Collections.reverseOrder    倒叙排序
        TreeSet<String> ts = new TreeSet<String>(Collections.reverseOrder(new ComparatorByLength()));

        ts.add("abc");
        ts.add("hahaha");
        ts.add("zzz");
        ts.add("aa");
        ts.add("cba");

        System.out.println(ts);

    }

    public static void demo_1(){
        List<String> list =new ArrayList<String>();

        list.add("abcde");
        list.add("cab");
        list.add("aa");
        list.add("zzz");
        list.add("nbaa");
        System.out.println(list);

        //对list集合进行指定顺序的排序
//        Collections.sort(list);
//        mysort(list);
//        mysort(list,new ComparatorByLenght());
        Collections.sort(list,new ComparatorByLenght());
        System.out.println(list);
    }

    public static void demo_2(){
        List<String> list =new ArrayList<String>();

        list.add("abcde");
        list.add("cab");
        list.add("aa");
        list.add("zzz");
        list.add("nbaa");
        System.out.println(list);

        //对list集合进行指定顺序的排序
        Collections.sort(list);
        System.out.println(list);

        //二分查找法
        int index = Collections.binarySearch(list,"cab");

        System.out.println("index:"+index);

        //获取最大值
        String max = Collections.max(list,new ComparatorByLenght());
        System.out.println("max="+max);
    }

    public static <T> void mysort( List<T> list, Comparator<? super T > comp){

        for (int i = 0; i < list.size()-1; i++) {

            for (int j = i+1; j < list.size(); j++) {

                if(comp.compare(list.get(i),list.get(j))>0){
//                    T temp =list.get(i);
//                    list.set(i,list.get(j));
//                    list.set(j,temp);
                    Collections.swap(list,i,j);
                }
            }
        }

    }



    public static<T extends Comparable<? super T> > void mysort( List<T> list){

        for (int i = 0; i < list.size()-1; i++) {

            for (int j = i+1; j < list.size(); j++) {

                if(list.get(i).compareTo(list.get(j))>0){
//                    T temp =list.get(i);
//                    list.set(i,list.get(j));
//                    list.set(j,temp);
                    Collections.swap(list,i,j);
                }
            }
        }

    }
}
