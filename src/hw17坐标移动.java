import java.util.Scanner;

public class hw17坐标移动 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int x = 0;
        int y = 0;
        while (scan.hasNext()) {

            String inputPath = scan.nextLine();

            String[] ips = inputPath.split(";");

            for (int i = 0; i < ips.length; i++) {

                char[] chars = ips[i].toCharArray();
                int distance = 0;

                try{
                    if (chars.length >3|| chars.length<2 || chars[1] > '9' || chars[2] > '9') {
                        continue;
                    }
                }catch(Exception e){
                }

                switch(chars.length){

                    case 2:
                        distance = (chars[1]-48);
                        break;
                    case 3:
                        distance = (chars[1]-48) * 10 + (chars[2]-48);
                        break;
                }

                switch (chars[0]) {

                    case 'A':
                        x -= distance;
                        break;
                    case 'W':
                        y += distance;
                        break;
                    case 'S':
                        y -= distance;
                        break;
                    case 'D':
                        x += distance;
                        break;
                }
            }
            System.out.print(x + "," + y);

        }
    }
}