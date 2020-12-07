import java.util.Scanner;

/*
题目描述
输入一行字符，分别统计出包含英文字母、空格、数字和其它字符的个数。

输入
1qazxsw23 edcvfr45tgbn hy67uj m,ki89ol.\\/;p0-=\\][
输出
26
3
10
12
*/
public class hw40输入一行字符统计其中包含英文字母空格数字其他符号的个数 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLine()){

            String input = scan.nextLine();

            calculateCounts(input);
        }
    }

    public static void calculateCounts(String s){

        char[] chars = s.toCharArray();
        int lettersCount = 0;
        int spaceCount = 0;
        int numCount = 0;
        int othersCount = 0;

        for(char c: chars){

            if((c>='a'&&c<='z')||(c>='A'&&c<='Z')){
                lettersCount++;
            }else if(c==32){
                spaceCount++;
            }else if(c>='0'&&c<='9'){
                numCount++;
            }else{
                othersCount++;
            }
        }
        System.out.println(lettersCount+"\n"+spaceCount+"\n"+numCount+"\n"+othersCount);
    }
}