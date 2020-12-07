import java.util.Scanner;

public class hw35蛇形矩阵 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (scan.hasNextInt()) {


            int index = scan.nextInt();

            int r = 1;

            for (int i = 1; i <= index; i++) {

                System.out.print(r);
                int temp = r;

                for (int j = i + 1; j <= index; j++) {

                    temp += j;
                    System.out.print(" " + temp);
                }
                System.out.println();
                r += i;
            }

        }
    }
}
