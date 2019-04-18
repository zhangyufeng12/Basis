package main.algorithm;

public class arr {
    public static void main( String[] args ) {
        int[] arr = {23, 12, 21, 31, 4, 54, 5, 5, 5};
//        getMax(arr);

        Maopao(arr);
        //Xuanze(arr);
//        quickSort(arr, 0, arr.length - 1);
        for (int m = 0; m < arr.length; m++) {
            System.out.print(arr[m] + "\t");

        }

        System.out.println();
        int index = halfSearch(arr, 12);
        System.out.println("index:"+index);

    }

    /*
    * 输出 数组中出现最多的元素及次数
    * */
    static void getMax( int[] arr ) {
        int[] count = new int[101]; //定义一个100以内的计数器
        int maxcount = count[0];
        int maxvalue = 0;

        //计数器遍历元素出现次数
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        //获取元素最多出现次数
        for (int i = 0; i < count.length - 1; i++) {
            if (count[i] > maxcount) {
                maxcount = count[i];
            }
        }
        //获取出现次数最多的value
        for (int i = 0; i < count.length - 1; i++) {
            if (count[i] == maxcount) {
                maxvalue = i;
            }

        }
        System.out.println("数组中出现最多次数：" + maxcount);
        System.out.println("数组中出现最多的数是：" + maxvalue);
        return;
    }

    /*
    * 冒泡排序
    * */
    static void Maopao( int[] arr ) {
        //外循环控制排序次数
        for (int i = arr.length - 1; i > 0; i--) {
            //内循环控制内部数组比较次数
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    Paixu(arr,j);
                }
            }
        }
        return;
    }

    /*
     * 选择排序
     * */
    static void Xuanze( int[] arr ) {
        //外循环控制排序次数
        for (int i = 0; i < arr.length - 1; i++) {
            //内循环控制内部数组比较次数
            for (int j = 0; j < arr.length - 1 - i; j++)
                if (arr[j] > arr[j + 1]) {
                    Paixu(arr, j);
                }
        }
        return;
    }

    private static void Paixu( int[] arr, int j ) {
        int temp;
        temp = arr[j + 1];
        arr[j + 1] = arr[j];
        arr[j] = temp;
    }


    //快速排序
    static void quickSort( int arr[], int low, int hight ) {
        int i, j, index;
        if (low > hight) {
            return;
        }
        i = low;
        j = hight;
        index = arr[i]; // 用子表的第一个记录做基准
        while (i < j) { // 从表的两端交替向中间扫描
            while (i < j && arr[j] >= index)
                j--;
            if (i < j)
                arr[i++] = arr[j];// 用比基准小的记录替换低位记录
            while (i < j && arr[i] < index)
                i++;
            if (i < j) // 用比基准大的记录替换高位记录
                arr[j--] = arr[i];
        }
        arr[i] = index;// 将基准数值替换回 a[i]
        quickSort(arr, low, i - 1); // 对低子表进行递归排序
        quickSort(arr, i + 1, hight); // 对高子表进行递归排序

        return;
    }







//二分法查找
static int halfSearch(int arr[],int key){
        int min=0;
        int max=arr.length-1;
        int mid=(max+min)/2;
        while (key!=arr[mid]){
            if(key>arr[mid]){
                min=mid+1;
            }
            if(key<arr[mid]){
                max=mid-1;
            }
            if(min>max){
                return -1;
            }
            mid=(max+min)/2;
        }


        return mid;
}

    }

