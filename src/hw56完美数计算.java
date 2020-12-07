import java.util.ArrayList;
import java.util.Scanner;
/*
题目描述
完全数（Perfect number），又称完美数或完备数，是一些特殊的自然数。
它所有的真因子（即除了自身以外的约数）的和（即因子函数），恰好等于它本身。
例如：28，它有约数1、2、4、7、14、28，除去它本身28外，其余5个数相加，1+2+4+7+14=28。

输入一个数字n

输出不超过n的完全数的个数
*/

public class hw56完美数计算 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()){

            int input = scan.nextInt();
            int count = 0;


            for(int i = 1; i<=input; i++){

                ArrayList<Integer> al = new ArrayList<>();

                int yuShuCount = 0;

                for(int j = 1; j < i; j++){

                    if(i % j == 0){

                        al.add(j);
                    }
                }

                for(Integer il: al){

                    yuShuCount+=il;
                }
                if(yuShuCount==i){
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}