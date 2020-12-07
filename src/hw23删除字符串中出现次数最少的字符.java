import java.util.*;

public class hw23删除字符串中出现次数最少的字符 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){

            char[] chars = scanner.nextLine().toCharArray();
            Map<Character, Integer> map = new HashMap<>();
            Map<Character, Integer> mapIndex = new HashMap<>();
            for(char c: chars){

                if(!map.containsKey(c)){

                    map.put(c, 1);

                }else {

                    map.put(c,map.get(c)+1);
                }
            }

            int min = Collections.min(map.values());
            Set<Character> characters = map.keySet();

            for(Character c: characters){

                if(min == map.get(c)){

                   mapIndex.put(c,0);
                }
            }

            for(char c: chars){

                if(!mapIndex.containsKey(c)){
                    System.out.print(c);
                }
            }
            System.out.println();
        }
    }
}
