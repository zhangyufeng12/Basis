package main;
/*
*@author  zhangyufeng
*@data 2018/11/27 下午12:26
*/

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {

    public static void main( String[] args ) {

       /*
		 * Map
		 * 	|--Hashtable
		 * 		|--Properties:
		 *
		 * Properties集合：
		 * 特点：
		 * 1，该集合中的键和值都是字符串类型。
		 * 2，集合中的数据可以保存到流中，或者从流获取。
		 *
		 * 通常该集合用于操作以键值对形式存在的配置文件。
		 *
		 *
		 */
        propertiesDemo();
    }

    /*
	 * Properties集合的存和取。
	 */

    public static void propertiesDemo() {
        //创建一个Properties集合。
        Properties prop = new Properties();

        //存储元素。
        prop.setProperty("zhangsan","30");
        prop.setProperty("lisi","31");
        prop.setProperty("wangwu","36");
        prop.setProperty("zhaoliu","20");

        //修改元素。
        prop.setProperty("wangwu","26");

        //取出所有元素。
        Set<String> names = prop.stringPropertyNames();
        for (String name : names){
            String value = prop.getProperty(name);
            System.out.println(name+":"+value);
        }
    }
}
