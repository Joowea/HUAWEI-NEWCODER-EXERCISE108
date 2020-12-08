import java.util.Scanner;
/*
题目描述
对字符串中的所有单词进行倒排。
1、构成单词的字符只有26个大写或小写英文字母；
2、非构成单词的字符均视为单词间隔符；
3、要求倒排后的单词间隔符以一个空格表示；如果原字符串中相邻单词间有多个间隔符时，倒排转换后也只允许出现一个空格间隔符；
4、每个单词最长20个字母；

输入描述:
输入一行以空格来分隔的句子
输出描述:
输出句子的逆序
*/
public class hw31单词倒排 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        while(scan.hasNextLine()){

            String input = scan.nextLine();

            System.out.println(seq(input));
        }
        scan.close();
    }

    public static String seq(String s ){

        String[] ss = s.split("[^a-z]+");

        StringBuilder sb = new StringBuilder();

        for(int i = ss.length-1; i>=0; i--){

            sb.append(ss[i]+" ");
        }

        return sb.toString();
    }
}