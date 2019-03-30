package main;
/*
*@author  zhangyufeng
*@data 2019/3/8 下午6:02
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class String_CountAndValue {

        public static void main(String[] args) throws Exception {
            String Str = "AAbbcccaaaa";
            char[] StrArr = Str.toCharArray();// 把字符串转为字符数组toCharArray

            Map<Character, Integer> map = MapFunction(StrArr);
            FindMapMaxValue(map);
        }

        /**
         * MapFunction:实现将字符数组转存到Map中， 其中，Map中的key为出现的字符，value对应该字符出现的次数
         * @param StrArr  StrArr字符数组，输入前必须先将字符串转为字符数组
         * @return map 集合中，key为出现的字符（Character），value对应该字符出现的次数（Integer）
         */
        public static Map<Character, Integer> MapFunction(char[] StrArr) {
            Map<Character, Integer> map = new HashMap<Character, Integer>();
            if (!(StrArr == null || StrArr.length == 0))// 先判断字符数组是否为空
                for (int i = 0; i < StrArr.length; i++)
                    if (null != map.get(StrArr[i])){
                        // 若不为空，说明已经存在相同字符，则Value值在原来的基础上加1
                        map.put(StrArr[i], map.get(StrArr[i]) + 1);
//                         System.out.println("StrArr[i]="+StrArr[i]+ " .....map.get:"+map.get( StrArr[i] ));

            }
                    else
                        map.put(StrArr[i], 1);

            return map;
        }

        /**
         * FindMapMaxValue 差找map中Value的最大值maxValue，类似于选择排序寻找最大值的过程：
         * 先任取一个Value值定义为最大值，然后与之比较
         * @param map 输入Map集合，该集合key为出现的字符（Character），value对应该字符出现的次数（Integer）
         * @return maxKey 返回出现次数最多的字符
         */
        public static int FindMapMaxValue(Map<Character, Integer> map) {

            Iterator iterator = map.entrySet().iterator();
            // 定义第一个为最大value和对应的key
            Map.Entry<Character,Integer> entry = (Map.Entry<Character, Integer>) iterator.next();
            char MaxKey = entry.getKey();
            int MaxValue = entry.getValue();
//            System.out.println(MaxKey+"....."+MaxValue);
            while (iterator.hasNext()){
                entry = (Map.Entry<Character, Integer>) iterator.next();
                char tempK = entry.getKey();
                int tempV = entry.getValue();
                if (tempV>MaxValue){
                    MaxKey=tempK;
                    MaxValue=tempV;
                }
            }

//            Set<Character> keys = map.keySet();// 获得所有key值
//            Iterator keys_Itera = keys.iterator();// 实例化Iterator
//            // keys_Itera.next():依次获得key值
//            // map.get(key):获得对应的value值
//            Character maxKey = (Character) keys_Itera.next();// 定义第一个为最大value和对应的key
//            int maxValue = map.get(maxKey);
//
//            while (keys_Itera.hasNext()) {
//                Character temp = (Character) keys_Itera.next();
//                if (maxValue < map.get(temp)) {
//                    maxKey = temp;
//                    maxValue = map.get(temp);
//                }
//            }
            System.out.println("出现次数最多的字符：" + MaxKey + " 出现次数：" + MaxValue);
            return MaxValue;
        }
    }