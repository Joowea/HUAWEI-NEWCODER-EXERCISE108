import java.util.Scanner;
import java.math.BigInteger;

/*
题目描述
输入两个用字符串表示的整数，求它们所表示的数之和。
字符串的长度不超过10000。

输入描述:
输入两个字符串。保证字符串只含有'0'~'9'字符

输出描述:
输出求和后的结果
*/
public class hw57高精度加法 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()){

            System.out.println(new BigInteger(scan.next()).add(new BigInteger(scan.next())));
        }
    }
}