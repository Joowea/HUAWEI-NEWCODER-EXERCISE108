import java.util.Scanner;
import java.util.TreeSet;
/*
题目描述
输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
保证输入的整数最后一位不是0。
输入描述:
输入一个int型整数

输出描述:
按照从右向左的阅读顺序，返回一个不含重复数字的新的整数
*/
public class hw09提取不重复的整数 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {

            StringBuilder sb = new StringBuilder(scanner.next());

            TreeSet<String> ts = new TreeSet<>();

            sb.reverse();

            for (int i = 0; i < sb.length(); i++) {

                if (ts.add(sb.substring(i,i+1))){

                    System.out.println(sb.substring(i,i+1));
                }
            }
        }
    }
}
