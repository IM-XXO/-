/**
 * 给定两个升序排序的有序数组 A和 B，以及一个目标值 x。
 * 数组下标从 0开始。
 * 请你求出满足 A[i]+B[j]=x的数对 (i,j)。
 * 数据保证有唯一解。
 */
import java.util.Scanner;
public class TwoPointers2 {

    public static void dmain(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int[] A = new int[100010];
        int[] B = new int[100010];
        for(int i=0; i<n; i++) A[i] = sc.nextInt();
        for(int i=0; i<n; i++) B[i] = sc.nextInt();
        int res = 0;
        for(int i=0,j=m-1; i<n; i++){
            while(j>=0 && A[i] + B[j] >x){
                j--;
                if(A[i] + B[j] == x){
                    System.out.print(i+" "+j);
                    break;
                }
            }
        }
    }
}
