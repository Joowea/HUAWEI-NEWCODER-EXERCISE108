import java.util.Scanner;

public class hw63DNA序列CG {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()){

            String input = scan.nextLine();
            double len = scan.nextDouble();

            find(input, len);
        }
    }

    private static void find(String s, double len){

        char[] chars = s.toCharArray();
        double degree = 0d;
        String CGLong = "";

        if(len==chars.length){
            System.out.println(s);
        }else{

            for(int i = 0; i<chars.length-len; i++){

                double ziLongCount = 0d;
                for(int j = i; j<i+len; j++){

                    if(chars[j]=='C'||chars[j]=='G'){

                        ziLongCount++;
                    }
                }
                double dd = ziLongCount/len;
                if(dd>degree){

                    degree = ziLongCount/len;
                    CGLong = s.substring(i,i+(int)len);
                }
            }
            System.out.println(CGLong);
        }

    }
}