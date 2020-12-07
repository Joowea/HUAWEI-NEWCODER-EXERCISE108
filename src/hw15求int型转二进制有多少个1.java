import java.util.Scanner;

public class hw15求int型转二进制有多少个1 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){

            int input = scanner.nextInt();
            int count = 0;

            String s = Integer.toBinaryString(input);

            char[] chars = s.toCharArray();

            for (char c: chars){

                if(c=='1'){

                    count++;
                }
            }

            System.out.println(count);
        }
    }

}