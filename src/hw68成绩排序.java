import java.util.*;

public class hw68成绩排序 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()){


            int count = scan.nextInt();
            int bool = scan.nextInt();
            LinkedHashMap<String, String> lhm = new LinkedHashMap<>();
            ArrayList<String> al = new ArrayList<>();

            for(int i = 0; i<count; i++){

                String name = scan.next();
                int score = scan.nextInt();

                lhm.put(name+" "+score, score+" "+name);
                al.add(score+" "+name);

            }

            Collections.sort(al);

            if(bool==0){
                Collections.reverse(al);
            }

            Set<String> ks = lhm.keySet();
            for(String Sl: al){

                for(String s: ks){
                    if(Sl.equals(lhm.get(s)) ){
                        System.out.println(s);
                    }
                }
            }
        }
    }
}

/*

28
1
qhsq 15
ozslg 79
ncttmtsphb 71

*/