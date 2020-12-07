import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class hw58输入n个整数输出最小的k个 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()){

            String condition = scan.nextLine();
            String numbs = scan.nextLine();

            calculateLittles(condition, numbs);

        }
    }

    private static void calculateLittles(String condition, String numbs){

        int count = Integer.parseInt(condition.split(" ")[0]);
        int index = Integer.parseInt(condition.split(" ")[1]);

        String[] ss = numbs.split(" ");

        List<Integer> arr = new ArrayList<>();

        for(String s: ss){
            arr.add(Integer.parseInt(s));
        }

        Collections.sort(arr);

        for(int i = 0; i<index; i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
    }
}