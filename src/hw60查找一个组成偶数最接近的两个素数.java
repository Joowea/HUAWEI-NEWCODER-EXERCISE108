import java.util.*;
/*
题目描述
任意一个偶数（大于2）都可以由2个素数组成，组成偶数的2个素数有很多种情况，
本题目要求输出组成指定偶数的两个素数差值最小的素数对。

输入描述:
输入一个偶数

输出描述:
输出两个素数
*/
public class hw60查找一个组成偶数最接近的两个素数 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()){

            int input = scan.nextInt();

            calculatePrimes(input);
        }
    }

    private static void calculatePrimes(int num){

        Map<Integer, Integer> tm = new TreeMap<>();
        int diff = num;
        int diffA = 0;
        int diffB = 0;

        for(int i = 1; i<num/2+1; i++){
            if(isPrimeNumber(i)&&isPrimeNumber(num-i)){
                tm.put(i,num-i);
            }
        }

        for(Map.Entry e: tm.entrySet()){
            if(diff-(Integer.parseInt(e.getValue().toString())-
                    Integer.parseInt(e.getKey().toString()))>0){

                diffA = Integer.parseInt(e.getKey().toString());
                diffB = Integer.parseInt(e.getValue().toString());
            }
        }

        System.out.println(diffA+"\n"+diffB);
    }

    private static boolean isPrimeNumber(int n){
        if(n==1){
            return false;
        }else{
            for(int i = 2; i<n; i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
    }
}