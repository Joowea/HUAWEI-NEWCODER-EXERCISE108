import java.util.Scanner;

public class hw33整数与ip地址的转换 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (scan.hasNextLine()) {

            String input1 = scan.nextLine();
            String input2 = scan.nextLine();
            ipToTen(input1);
            tenToIp(input2);


        }
    }

    public static void ipToTen(String s) {

        String[] ss = s.split("\\.");
        StringBuilder sb = new StringBuilder();

        for (String a : ss) {

            StringBuilder sbTemp = new StringBuilder(Integer.toBinaryString(Integer.valueOf(a)));

            int length = sbTemp.length();

            if (length < 8) {

                for (int i = 0; i < 8 - length; i++) {

                    sbTemp.reverse().append("0").reverse();
                }
            }
            sb.append(sbTemp);
        }
        System.out.println(Long.parseLong(sb.toString(), 2));
    }

    public static void tenToIp(String s) {

        long temp=Long.parseLong(s);

        String ip=Long.toBinaryString(temp);

        StringBuilder sb=new StringBuilder();

        if(ip.length()<32){

            for(int i=0;i<(32-ip.length());i++){

                sb.append(0);
            }

            sb.append(ip);

        }else if(ip.length()==32){

            sb.append(ip);
        }

        for(int i=0;i<sb.length()-8;i=i+8){

            System.out.print(Integer.parseInt(sb.substring(i,i+8),2)+".");
        }

        System.out.println(Integer.parseInt(sb.substring(sb.length()-8,sb.length()),2));

    }
}