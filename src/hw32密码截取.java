import java.util.Scanner;

public class hw32密码截取 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (scan.hasNextLine()) {

            String input = scan.nextLine();

            System.out.println(findLongest(input));


        }
    }


    public static int findLongest(String s) {

        if (s == "" || s.length() < 1) {
            return 0;
        }

        //int start = 0; //start是最长回文子串的开始位置
        //int end = 0;
        int lenT = 0;
        int len = 0;

        for (int i = 0; i < s.length()-1; i++) {

            int len1 = expand(s, i, i);
            int len2 = expand(s, i, i + 1);

            if (len1 > len2) {
                len = len1;
            } else {
                len = len2;
            }
            if (len>lenT){
                lenT=len;
            }
        }
        return lenT;

    }

    public static int expand(String s, int left, int right) {

        try {
            while (left >= 0 && right >= 0 && s.toCharArray()[left] == s.toCharArray()[right]) {

                left--;
                right++;
            }
        }catch (Exception e){

        }

        return right - left - 1;
    }
}