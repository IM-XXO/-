/**
 * 给定一个长度为 n的整数数列，以及一个整数 k
 * 请用快速选择算法求出数列从小到大排序后的第 k个数。
 */
import java.util.Scanner;
public class QuickSort2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] sortedArr = quickSort(arr,0,n-1);
        System.out.println(sortedArr[k-1]);
    }
    public static int[] quickSort(int[] arr,int left,int right){
        if(left >= right){
            return arr;
        }
        int p = arr[(left + right)/2];
        int i = left - 1;
        int j = right +1;
        while(i < j){
            while(arr[++i]<p);
            while(arr[--j]>p);
            if(i<j){
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        quickSort(arr,left,j);
        quickSort(arr,j+1,right);
        return arr;
    }

}