import java.util.Scanner;

public class hw38小球五次落地距离 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()){

            int hight = scan.nextInt();

            calculateDistances(hight);
        }
    }

    public static void calculateDistances(int is){

        int hight = is*1000000;
        int distance = hight;

        for(int i = 0; i<4; i++){
            distance+=hight;
            hight/=2;
        }
        hight/=2;

        System.out.println((double)distance/1000000);
        System.out.println((double)hight/1000000);
    }
}