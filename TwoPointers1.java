/**
 * 给定一个长度为 n的整数序列，请找出最长的不包含重复的数的连续区间，输出它的长度。
 */

import java.util.Scanner;
public class TwoPointers1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[100010];
        int[] s = new int[100010];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        int res = 0;
        for(int i=0,j=0; i<n; i++){
            s[arr[i]]++;
            while(j<i && s[arr[i]]>1){
                s[arr[j]]--;
                j++;
            }
            res = Math.max(res,i-j+1);
        }
        System.out.println(res);
    }

}
