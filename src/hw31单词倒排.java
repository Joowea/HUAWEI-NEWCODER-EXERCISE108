import java.util.Scanner;

public class hw31单词倒排 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        while(scan.hasNextLine()){

            String input = scan.nextLine();

            seq(input);
        }
        scan.close();
    }

    public static String seq(String s ){

        String[] ss = s.split("[^a-zA-Z1-9]+");

        StringBuilder sb = new StringBuilder();

        for(int i = ss.length-1; i>=0; i--){

            sb.append(ss[i]+" ");
        }

        return sb.toString();
    }
}