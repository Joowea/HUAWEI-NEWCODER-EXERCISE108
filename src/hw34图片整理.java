import java.util.*;

public class hw34图片整理 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){

            String str = sc.nextLine();

            char[] cs = str.toCharArray();

            Arrays.sort(cs);

            System.out.println(cs);
        }


        sc.close();
    }
}