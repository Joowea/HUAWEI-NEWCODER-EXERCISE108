import java.util.Scanner;

public class hw24合唱队队伍身高 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine()){

            int n = Integer.parseInt(sc.nextLine());
            String str = sc.nextLine();
            System.out.println(removeNo(str,n));
        }
    }

    public static int removeNo(String str,int n){
        String[] stra = str.split(" ");
        int[] height = new int[n];//分别为正序和逆序的整型数组
        int[] heightopp = new int[n];
        for(int i=0;i<n;i++){
            height[i] = Integer.parseInt(stra[i]);
        }
        for(int i=0;i<n;i++){
            heightopp[i] = height[n-i-1];
        }
        int[] dp = Maxsub(height,n);//递增计数
        int[] dpopp = Maxsub(heightopp,n);//递减计数（逆序）
        int[] sum = new int[n];
        for(int i=0;i<n;i++){
            sum[i] = dp[i]+dpopp[n-i-1];//相加时要将递减计数倒过来
        }
        int max = 0;//求递增计数与递减计数之和的最大值
        for(int i=0;i<n;i++){
            max = sum[i]>max?sum[i]:max;
        }
        return n-(max-1);//返回出列人数
    }

    public static int[] Maxsub(int[] stra,int n){//按公式dp[i]={max(dp[j])+1,j<i且a[j]<a[i]}求dp[i]
        int[] dp = new int[n];
        for (int i=0;i<n;i++){
            dp[i] = 1;
            for (int j=0;j<i;j++) {
                if (stra[j]<stra[i]) {
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
        }
        return dp;
    }
}