/*
题目描述
计算字符串最后一个单词的长度，单词以空格隔开。

输入描述:
输入一行，代表要计算的字符串，非空，长度小于5000。

输出描述:
输出一个整数，表示输入字符串最后一个单词的长度。
*/

import java.util.Scanner;

public class hw01计算字符串最后一个单词长度 {

    public static int calculateLastWordLengthInString(String s){

        String[] ss = s.split(" "); //空格分割string 返回字符串数组

        return ss[ss.length-1].length(); //计算最后一个字符串的长度
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){

            String str = sc.nextLine();

            System.out.println(calculateLastWordLengthInString(str));
        }

    }
}
