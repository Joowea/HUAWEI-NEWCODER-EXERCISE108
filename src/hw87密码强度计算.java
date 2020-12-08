import java.util.Scanner;

public class hw87密码强度计算 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()){

            String input = scan.nextLine();

            System.out.println(psdScore(input));
        }
    }

    private static String psdScore(String psd){

        String re = "";
        int score = 0;
        char[] psdChars = psd.toCharArray();
        int len = psdChars.length;
        int isLowerCase = 0; int isUpperCase = 0; int isLetter = 0;
        int countNum = 0; int isNum = 0;
        int countSymb = 0; int isSymb = 0;
        int addScore = 0;

        if(len<=4){
            score += 5;
        }else if(len>4&&len<=7){
            score += 10;
        }else if(len>7){
            score += 25;
        }

        for(char c: psdChars){
            if(c>='a'&&c<='z'){
                isLowerCase = 10;
                isLetter = 10;
            }else if(c>='A'&&c<='Z'){
                isUpperCase = 10;
                isLetter = 10;
            }else if(c>='0'&&c<='9'){
                countNum+=1;
                isNum = 10;
            }else{
                countSymb+=1;
                isSymb = 10;
            }
        }
        if(countNum==1){
            score+=10;
        }else if(countNum>1){
            score+=20;
        }

        if(countSymb==1){
            score+=10;
        }else if(countSymb>1){
            score+=25;
        }

        if(isLowerCase>0&&isUpperCase>0&&isNum>0&&isSymb>0){
            addScore+=5;
        }else if(isLetter>0&&isNum>0&&isSymb>0){
            addScore+=3;
        }else if(isLetter>0&&isNum>0){
            addScore+=2;
        }

        score+=isLowerCase+=isUpperCase+=addScore;

        if(score>=0&&score<25){
            re = "VERY_WEAK";
        }else if(score>=25&&score<50){
            re = "WEAK";
        }else if(score>=50&&score<60){
            re = "AVERAGE";
        }else if(score>=60&&score<70){
            re = "STRONG";
        }else if(score>=70&&score<80){
            re = "VERY_STRONG";
        }else if(score>=80&&score<90){
            re = "SECURE";
        }else{
            re = "VERY_SECURE";
        }
        return re;
    }
}