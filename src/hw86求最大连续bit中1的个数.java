import java.util.Scanner;

public class hw86求最大连续bit中1的个数 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()){

            int input = scan.nextInt();

            System.out.println(calculateCountOne(input));
        }
    }

    private static int calculateCountOne(int num){

        String[] ss = Integer.toBinaryString(num).split("0");
        int len = 0;

        for(String S: ss){

            if(S.length()>len){
                len = S.length();
            }
        }
        return len;
    }
}