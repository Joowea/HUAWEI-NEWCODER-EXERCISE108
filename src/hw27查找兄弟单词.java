import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
题目描述

定义一个单词的“兄弟单词”为：交换该单词字母顺序，而不添加、删除、修改原有的字母就能生成的单词。
兄弟单词要求和原来的单词不同。例如：ab和ba是兄弟单词。ab和ab则不是兄弟单词。
现在给定你n个单词，另外再给你一个单词str，让你寻找str的兄弟单词里，字典序第k大的那个单词是什么？
注意：字典中可能有重复单词。本题含有多组输入数据。

输入描述:

先输入单词的个数n，再输入n个单词。
再输入一个单词，为待查找的单词x
最后输入数字k

输出描述:

输出查找到x的兄弟单词的个数m
然后输出查找到的按照字典顺序排序后的第k个兄弟单词，没有符合第k个的话则不用输出。
*/
public class hw27查找兄弟单词 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()){

            int count = scan.nextInt();
            String[] ss = new String[count];
            ArrayList<String> sList = new ArrayList<>();

            for(int i = 0; i<count; i++){

                ss[i] = scan.next();
            }

            String key = scan.next();

            for(String s: ss){
                int x = 0;
                if(key.length()==s.length()){
                    ArrayList<Character> arr = new ArrayList<>();
                    for(int j = 0; j<key.length();j++){

                        arr.add(key.toCharArray()[j]);

                    }

                    for(int j = 0; j<key.length();j++){


                        if(arr.contains(s.toCharArray()[j])){
                            arr.remove((Character)s.toCharArray()[j]);
                            x++;
                        }
                    }
                    if (x == key.length()&&!s.equals(key)){
                        sList.add(s);
                    }
                }
            }

            Collections.sort(sList);
            System.out.println(sList.size());

            int index = scan.nextInt();
            if(sList.size()>=index){
                System.out.println(sList.get(index-1));
            }

        }
    }
}