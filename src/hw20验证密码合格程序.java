import java.util.Scanner;

/*
题目描述
密码要求:

1.长度超过8位

2.包括大小写字母.数字.其它符号,以上四种至少三种

3.不能有相同长度大于2的子串重复

输入描述:
一组或多组长度超过2的子符串。每组占一行

输出描述:
如果符合要求输出：OK，否则输出NG
*/
public class hw20验证密码合格程序 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {

            String psd = scan.next();

            System.out.println(isTrue(psd));

        }
    }

    public static String isTrue(String s) {

        char[] chars = s.toCharArray();
        int count = chars.length;
        int isNum = 0;
        int isUpperCaseL = 0;
        int isLowerCaseL = 0;
        int isSym = 0;

        if (count <= 8) {
            return "NG";
        }

        for (int i = 0; i < count; i++) {

            if (chars[i] >= '0' && chars[i] <= '9') {
                isNum = 1;
                continue;

            } else if (chars[i] >= 'a' && chars[i] <= 'z') {
                isLowerCaseL = 1;
                continue;
            } else if (chars[i] >= 'A' && chars[i] <= 'Z') {
                isUpperCaseL = 1;
                continue;
            } else {
                isSym = 1;
                continue;
            }
        }

        int calculateIsTrue = isSym + isLowerCaseL + isUpperCaseL + isNum;

        if (calculateIsTrue < 3) {
            return "NG";
        }

        for (int i = 0; i < count - 3; i++) {

            StringBuilder sba = new StringBuilder();
            sba.append(chars[i]).append(chars[i + 1]).append(chars[i + 2]);

            for (int j = i + 3; j < count - 2; j++) {

                StringBuilder sbb = new StringBuilder();
                sbb.append(chars[j]).append(chars[j + 1]).append(chars[j + 2]);

                if (sba.toString().equals(sbb.toString())) {
                    return "NG";

                }
            }
        }
        return "OK";
    }
}