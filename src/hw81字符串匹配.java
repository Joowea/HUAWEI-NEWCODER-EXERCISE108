import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
题目描述
判断短字符串中的所有字符是否在长字符串中全部出现。

输入描述:
输入两个字符串。第一个为短字符串，第二个为长字符串。两个字符串均由小写字母组成。

输出描述:
如果短字符串的所有字符均在长字符串中出现过，则输出true。否则输出false。
*/
public class hw81字符串匹配 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()){

            String sShort = scan.next();
            String sLong = scan.next();

            System.out.println(isContains(sShort, sLong));
        }
    }

    private static boolean isContains(String sShort, String sLong){

        Set<Character> sL = new HashSet<>();

        char[] charsL = sLong.toCharArray();
        char[] charsS = sShort.toCharArray();

        for(char c: charsL){
            sL.add(c);
        }

        for(char c: charsS){
            if(sL.add((c))){
                return false;
            }
        }
        return true;
    }
}