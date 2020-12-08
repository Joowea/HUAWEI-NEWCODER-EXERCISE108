import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hw94计票统计 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()){

            int countCandid = Integer.parseInt(scan.nextLine());
            String candid = scan.nextLine();
            int countTicket = Integer.parseInt(scan.nextLine());
            String ticket = scan.nextLine();

            countVotes(candid,ticket);
        }
    }
    private static void countVotes(String candid, String ticket){

        String[] ssCandid = candid.split(" ");
        String[] ssTicket = ticket.split(" ");

        Map<String, Integer> cm = new HashMap<>();

        for(String S: ssCandid){
            cm.put(S,0);
        }
        cm.put("Invalid", 0);

        for(String St: ssTicket){
            if(!cm.containsKey(St)){
                cm.put("Invalid",cm.get("Invalid")+1);
                continue;
            }
            for(String Sc: ssCandid){

                if(St.equals(Sc)){
                    cm.put(Sc,cm.get(Sc)+1);
                    break;
                }
            }
        }
        for(String sKS: cm.keySet()){
            System.out.println(sKS+" : "+cm.get(sKS));
        }
    }
}