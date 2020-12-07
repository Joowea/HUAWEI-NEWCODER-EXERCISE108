import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class hw14字符串字典排序 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){

            int count = scanner.nextInt();
            ArrayList<String> arr = new ArrayList<>();

            for (int i = 0; i < count; i++) {

                arr.add(scanner.next());
            }

            Collections.sort(arr);

            for(String s: arr){

                System.out.println(s);
            }
        }
    }
}
