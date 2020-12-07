import java.util.LinkedHashMap;
import java.util.Scanner;
/*
题目描述
找出字符串中第一个只出现一次的字符

输入描述:
输入几个非空字符串

输出描述:
输出第一个只出现一次的字符，如果不存在输出-1
*/
public class hw59查找只出现一次的字符串 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()){

            String input = scan.nextLine();

            System.out.println(findTheOnlyOne(input));
        }
    }

    private static String findTheOnlyOne(String s){

        char[] sc = s.toCharArray();
        LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<>();
        Character re = null;

        for(char c: sc){

            if(lhm.containsKey(c)){
                lhm.put(c,lhm.get(c)+1);
            }else{
                lhm.put(c,1);
            }
        }

        for(Character C: lhm.keySet()){

            if(lhm.get(C)==1){
                re = C;
                break;
            }
        }
        if(re==null){
            return "-1";
        }else {
            return re.toString();
        }
    }
}