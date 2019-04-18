package main.algorithm;



public class Int_CandV {
    public static void main(String[] args) {
        int[] a = {99,12,34,31,12,31,44,67,12};

//        CandVFunction(a);
        ValueFunction(a);
        int index = SearchKey(a,67);
        System.out.println("key的位置："+index);
    }

    private static int SearchKey(int[] a, int key) {
        int max=a.length-1;
        int min =0;
        int mid = (max+min)/2;
        while (key!=a[mid]){
            if (key>a[mid]){
                min= mid+1;
            }
            if (key<a[mid]){
                max=mid-1;
            }
            if (max==min){
                return -1;
            }
            mid = (max+min)/2;
        }

        return mid;
    }

    private static void ValueFunction(int[] a) {
        int temp;
        for (int i =a.length-1;i>0;i--){
            for (int j =0;j<a.length-1;j++){
            if (a[j]>a[j+1]){
                temp=a[j+1];
                a[j+1]=a[j];
                a[j]=temp;
            }
            }
        }
        System.out.println("最大值為："+ a[a.length-1]);
        System.out.println("最小值為："+ a[0]);

    }

    private static void CandVFunction(int[] a) {
        //創建計數器
        int[] count = new int[101];
        int maxvalue = 0;
        int maxcount = count[0];

        //遍歷出現次數
        for (int i=0;i<a.length;i++){
            count[a[i]]++;
        }
        //获取元素最多出现次数
        for (int i=1;i<count.length-1;i++){
            if (maxcount<count[i]){
                maxcount=count[i];
            }
        }
        //根據次數最值
        for (int i=1;i<count.length-1;i++){
            if (maxcount==count[i]){
                maxvalue=i;
            }
        }
        System.out.println("数组中出现最多次数：" + maxcount);
        System.out.println("数组中出现最多的数是：" + maxvalue);
    }
}
