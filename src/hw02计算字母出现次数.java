/*
题目描述
写出一个程序，接受一个由字母、数字和空格组成的字符串，和一个字母，
然后输出输入字符串中该字母的出现次数。不区分大小写。

输入描述:
第一行输入一个由字母和数字以及空格组成的字符串，第二行输入一个字母。

输出描述:
输出输入字符串中含有该字符的个数。
 */

import java.util.Scanner;

public class hw02计算字母出现次数 {

    public static int calculateLettersTimes(String s, char[] t) {

        int i = 0;

        char[] chars = s.toCharArray();

        /*for (int j = 0; j < chars.length; j++) {

            if(chars[j] == t[0]){
                i++;
            }
        }*/

        for (char cs: chars){

            if(cs == t[0]){
                i++;
            }
        }
        return i;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()){

            System.out.println(calculateLettersTimes(scan.nextLine().toLowerCase(),
                    scan.nextLine().toLowerCase().toCharArray()));

        }
    }
}

