import java.util.Scanner;
/*
题目描述
输出7有关数字的个数，包括7的倍数，还有包含7的数字（如17，27，37...70，71，72，73...）的个数

输入一个正整数N。(N不大于30000)

输出不大于N的与7有关的数字个数，例如输入20，与7有关的数字包括7,14,17.
*/
public class hw55挑7 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()){

            int input = scan.nextInt();

            int count = 0;

            if(input==0){
                System.out.println(count);
            }else{
                for(int i = 1; i<=input; i++){

                    if(String.valueOf(i).contains("7")||i%7==0){
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
    }
}