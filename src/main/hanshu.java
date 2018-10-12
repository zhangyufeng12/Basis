package main;

import java.util.Scanner;

public class hanshu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("a:");
        int a=sc.nextInt();
        System.out.print("b:");
        int b=sc.nextInt();


        int c= add(a,b);
        System.out.println(c);
       // prin();

    }


    static int add ( int a, int b){

        return a+b;
    }

        static void prin(){

        System.out.println("hello java");
    }
}

