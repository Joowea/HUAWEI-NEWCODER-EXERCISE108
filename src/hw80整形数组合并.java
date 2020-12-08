import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
/*
题目描述
将两个整型数组按照升序合并，并且过滤掉重复数组元素。
输出时相邻两数之间没有空格。
请注意本题有多组样例。

输入描述:
1 输入第一个数组的个数
2 输入第一个数组的数值
3 输入第二个数组的个数
4 输入第二个数组的数值

输出描述:
输出合并之后的数组
*/
public class hw80整形数组合并 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {

            int count1 = scan.nextInt();

            Set<Integer> sI = new TreeSet<>();

            for (int i = 0; i < count1; i++) {

                sI.add(scan.nextInt());
            }

            int count2 = scan.nextInt();


            for (int i = 0; i < count2; i++) {

                sI.add(scan.nextInt());
            }

            for (Integer I : sI) {

                System.out.print(I);
            }
            System.out.println();
        }
    }
}