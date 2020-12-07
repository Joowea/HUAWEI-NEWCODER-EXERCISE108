import java.io.*;
import java.util.Scanner;

/*
题目描述
功能:输入一个正整数，按照从小到大的顺序输出它的所有质因子（重复的也要列举）（如180的质因子为2 2 3 3 5 ）

最后一个数后面也要有空格

输入描述:
输入一个long型整数

输出描述:
按照从小到大的顺序输出它的所有质数的因子，以空格隔开。最后一个数后面也要有空格。
*/

public class hw06求所有质数 {

    public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String str = "";

            while ((str = br.readLine()) != null) {

                long num = Long.parseLong(str);

                StringBuffer sb = new StringBuffer();

                for (int i = 2; i <= Math.sqrt(num); i++) {

                    if (num % i == 0) {

                        sb.append(i).append(" ");
                        num = num / i;
                        i--;
                    }
                }

                sb.append(num + " ");

                System.out.println(sb.toString());
            }
        }
    }