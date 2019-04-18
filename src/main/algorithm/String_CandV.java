package main.algorithm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class String_CandV {
    public static void main(String[] args) {
        String str="aaaccvmmmsadqqqqq";
        //转字符数组
        char[] StrArr = str.toCharArray();
        //转map
        Map<Character,Integer> map = ChangeMap(StrArr);
        FindCandV(map);
    }

    public static int FindCandV(Map<Character, Integer> map) {
        Iterator iterator = map.entrySet().iterator();
        Map.Entry<Character,Integer> entry = (Map.Entry<Character, Integer>) iterator.next();
        char MaxKey =entry.getKey();
        int MaxValue =entry.getValue();
        while (iterator.hasNext()){
            entry = (Map.Entry<Character, Integer>) iterator.next();
            int tempValue =entry.getValue();
            char tempKey =entry.getKey();
            if (tempValue>MaxValue){
                MaxKey=tempKey;
                MaxValue=tempValue;
            }
        }
        System.out.println("出现次数最多的字符：" + MaxKey + " 出现次数：" + MaxValue);
        return MaxValue;
    }

    public static Map<Character, Integer> ChangeMap(char[] strArr) {
        Map<Character,Integer> map =new HashMap<Character, Integer>();
        if (!(strArr.length==0||strArr==null)){
            for (int i=0;i<strArr.length;i++){
                if (map.get(strArr[i])!=null) {
                    map.put(strArr[i], map.get(strArr[i])+1);
                }else
                    map.put(strArr[i], 1);
        }
        }
        return map;
    }
}
