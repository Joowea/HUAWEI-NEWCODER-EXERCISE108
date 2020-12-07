import java.util.Scanner;

/*
题目描述
写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。

输入描述:
输入一个十六进制的数值字符串。注意：一个用例会同时有多组输入数据，

输出描述:
输出该数值的十进制字符串。不同组的测试用例用\n隔开。
*/

/*
直接调用Java的decode方法.
该方法的作用是将 String 解码为 Integer。接受十进制、十六进制和八进制数字。

根据要解码的 String（mn)的形式转成不同进制的数字。
mn由三部分组成：符号、基数说明符和字符序列。
-0X123中-是符号位，
0X是基数说明符（0表示八进制，0x,0X，#表示十六进制，什么都不写则表示十进制），
123是数字字符序列。
*/
public class hw05十六进制转十进制 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){


            String s = scanner.nextLine();

            System.out.println(Integer.decode(s));
        }
    }
}
