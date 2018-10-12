package main.day08;

public class ArrayToolDome {
    public static void main(String[] args){
        int[] arr={3,8,2,92,7,9};
       // ArrayTool tool = new ArrayTool();

        int max = ArrayTool.getMax(arr);
        System.out.println("max =" +max);

        int index=ArrayTool.getIndex(arr,9);
        System.out.println("index = "+index);


        ArrayTool.selectSort(arr);


    }
}
