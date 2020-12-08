import java.util.Scanner;
/*
题目描述
输入一个字符串，返回其最长的数字子串，以及其长度。若有多个最长的数字子串，则将它们全部输出（按原字符串的相对位置）

输入描述:
输入一个字符串。

输出描述:
输出字符串中最长的数字字符串和它的长度，中间用逗号间隔。如果有相同长度的串，则要一块儿输出（中间不要输出空格）。
*/
public class hw92在字符串中寻找最长数字子串 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()){

            String input = scan.next();

            calculateNum(input);
        }
    }

    private static void calculateNum(String s){

        String[] ss = s.split("[^0-9]+");
        int len = 0;
        StringBuilder sb = new StringBuilder();

        for(String S: ss){

            if(S.length()>len){

                len = S.length();
            }
        }

        for(String S: ss){

            if(S.length()==len){
                sb.append(S);
            }
        }
        System.out.println(sb+","+len);

    }
}