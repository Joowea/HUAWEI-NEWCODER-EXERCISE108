import java.util.Scanner;
/*
题目描述
1、对输入的字符串进行加解密，并输出。

2、加密方法为：

当内容是英文字母时则用该英文字母的后一个字母替换，同时字母变换大小写,如字母a时则替换为B；字母Z时则替换为a；

当内容是数字时则把该数字加1，如0替换1，1替换2，9替换0；

其他字符不做变化。

3、解密方法为加密的逆过程。


本题含有多组样例输入。
输入描述:
输入说明
输入一串要加密的密码
输入一串加过密的密码

输出描述:
输出说明
输出加密后的字符
输出解密后的字符

示例1
输入
复制
abcdefg
BCDEFGH
输出
复制
BCDEFGH
abcdefg
*/
public class hw29字符串加密解密 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()){

            String input1 = scan.nextLine();

            String input2 = scan.nextLine();

            jiaMi(input1);
            jieMi(input2);

        }

    }

    public static void jiaMi(String s){

        char[] chars = s.toCharArray();

        for(int i = 0; i<chars.length; i++){

            if(chars[i]>='a'&&chars[i]<'z'){
                chars[i]-=31;
            }else if(chars[i]=='z'){
                chars[i] = 'A';
            }else if(chars[i]>='A'&&chars[i]<'Z'){
                chars[i]+=33;
            }else if(chars[i]=='Z'){
                chars[i] = 'a';
            }else if(chars[i]>='0'&&chars[i]<'9'){
                chars[i]= (char)(chars[i]+1);
            }else if(chars[i]=='9'){
                chars[i]='0';
            }
        }
        System.out.println(chars);
    }

    public static void jieMi(String s){

        char[] chars = s.toCharArray();

        for(int i = 0; i<chars.length; i++){

            if(chars[i]>'a'&&chars[i]<='z'){
                chars[i]-=33;
            }else if(chars[i]=='a'){
                chars[i] = 'Z';
            }else if(chars[i]>'A'&&chars[i]<='Z'){
                chars[i]+=31;
            }else if(chars[i]=='A'){
                chars[i] = 'z';
            }else if(chars[i]>'0'&&chars[i]<='9'){
                chars[i]= (char)(chars[i]-1);
            }else if(chars[i]=='0'){
                chars[i]='9';
            }
        }
        System.out.println(chars);
    }
}
