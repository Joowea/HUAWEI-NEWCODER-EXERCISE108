import java.util.Scanner;
/*
题目描述
根据输入的日期，计算是这一年的第几天。。

输入描述:
输入多行，每行空格分割，分别是年，月，日

输出描述:
成功:返回outDay输出计算后的第几天;失败:返回-1
*/

public class hw73判断某一天是一年中的第几天 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {

            int year = scan.nextInt();
            int month = scan.nextInt();
            int day = scan.nextInt();

            System.out.println(calculateDays(year, month, day));
        }
    }

    private static int calculateDays(int year, int month, int day) {

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int re = 0;
        if (year <= 0 || month <= 0 || month > 12 || day <= 0 || day > days[month - 1]) {

            return -1;
        }
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {

            days[1] = 29;
        }
        for (int i = 0; i < month - 1; i++) {

            re += days[i];
        }
        return re += day;
    }
}