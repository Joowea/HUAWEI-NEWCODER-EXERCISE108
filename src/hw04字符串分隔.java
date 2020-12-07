import java.util.Scanner;

public class hw04字符串分隔 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){

            String s = scanner.next();

            if(s.length()%8!=0){
                s = s+"00000000";  //多的0不打印 无关结果
            }

            while (s.length()>=8){

                System.out.println(s.substring(0,8));

                s = s.substring(8);
            }
        }

    }

}