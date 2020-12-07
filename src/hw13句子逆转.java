import java.util.Scanner;
/*
题目描述
将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符

输入描述:
输入一个英文语句，每个单词用空格隔开。保证输入只包含空格和字母。

输出描述:
得到逆序的句子
*/
public class hw13句子逆转 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()){

            String input = scan.nextLine(); //nextLine 使用输入的一整行

            String[] ss = input.split(" ");
            StringBuilder sb = new StringBuilder();

            for(int i = ss.length-1; i>=0; i--){

                sb.append(ss[i]+" ");
            }

            System.out.print(sb);


        }
    }



}