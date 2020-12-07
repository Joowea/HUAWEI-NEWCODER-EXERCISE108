import java.util.*;
/*
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
T R A I L B Z E S C D F G H J K M N O P Q U V W X Y

上面其他用字母表中剩余的字母填充完整。在对信息进行加密时，信息中的每个字母被固定于顶上那行，
并用下面那行的对应字母一一取代原文的字母(字母字符的大小写状态应该保留)。因此，使用这个密匙，
Attack AT DAWN(黎明时攻击)就会被加密为Tpptad TP ITVH。


示例1 输入 nihao ni 输出 le
*/
public class hw36字符串加密_黎明时攻击 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()){
            String inputKey = scan.nextLine();//输入密匙
            String inputInfo = scan.nextLine();//加密前

            jiaMi(inputKey, inputInfo);
        }
    }

    private static void jiaMi(String key, String info) {

        Map<Character, Character> m26 = new LinkedHashMap<>();//容量26的map，value为有序字母，均大写

        char[] chars = key.toCharArray();//密匙转char[]先存
        char mValue = 65;//密匙对应的value，下文通过for叠加

        for (char c : chars) {//遍历密匙存map

            if(!m26.containsKey(Character.toUpperCase(c))){//根据hash特性本来可以不判断其中有没有重复key，
                m26.put(Character.toUpperCase(c), mValue);//但是不判断有序的value会一直叠加
                mValue++;
            }
        }
        for (char i = 65; i < 91; i++) {

            if (!m26.containsKey(i)) {//继续存储剩余的字母
                m26.put(i, mValue);
                mValue++;
            }
        }//至此map完工

        String[] infoS = info.split(" ");//可以第二行输入多个待加密的info一起加密（额外功能）
        for (String s : infoS) {

            char[] infoChars = s.toCharArray();

            for (char c : infoChars) {

                if (c >= 'a' && c <= 'z') {//如果是小写字母
                    for (Character C : m26.keySet()) {

                        if (c - +32 == m26.get(C)) {//换算大写字母的ascii数值比较
                            System.out.print(C.toString().toLowerCase());
                        }
                    }
                } else if (c >= 'A' && c <= 'Z') {//大写字母直接比较

                    for (Character C : m26.keySet()) {

                        if (c == C) {
                            System.out.print(C);
                        }
                    }
                }
            }
            System.out.println(" ");//多个待加密，空格分割（额外）
        }
    }
}