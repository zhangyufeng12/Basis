package main.algorithm;

public class Prime_Num {
    public static void main(String[] args) {
        int num=15;
//        System.out.println(IsPrime(num));
        getPrime(num);
    }

    public static void getPrime(int num) {
        int j;
        if (num<1){
            System.out.println("false");
        }else
            for (int i=1;i<=num;i++){
                j=2;
                while (i%j!=0){
                    j++;
                    if (i==j)
                        System.out.println(i);

                }
            }
    }

    public static boolean IsPrime(int num) {
        if (num==2) return true;
        if (num%2==0||num<2)
            return false;
            for (int i=2;i<num;i++){
            if (num%i==0)
                return false;
            }
        return true;
    }
}
