
/*
题目描述
写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整。

输入描述:
输入一个正浮点数值

输出描述:
输出该数值的近似整数值
*/

import java.util.Scanner;

public class hw07四舍五入 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){

            String input = scanner.next();

            int a = Integer.parseInt(input.substring(0, input.indexOf(".")));
            int b = Integer.parseInt(input.substring(input.indexOf(".")+1,input.indexOf(".")+2));

            if(b>=5){

                a++;
            }

            System.out.println(a);


        }
    }
}
