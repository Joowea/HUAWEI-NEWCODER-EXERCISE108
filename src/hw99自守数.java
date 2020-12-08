import java.util.Scanner;
/*
题目描述
自守数是指一个数的平方的尾数等于该数自身的自然数。
例如：25^2 = 625，76^2 = 5776，9376^2 = 87909376。请求出n以内的自守数的个数
*/
public class hw99自守数 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()){

            int input = scan.nextInt();

            System.out.println(findItselfNum(input));
        }
    }

    private static int findItselfNum(int num){
        int count = 0;

        for(int i = 0; i<=num; i++){

            if(String.valueOf(i*i).endsWith(String.valueOf(i))){

                count++;
            }

        }
        return count;
    }
}