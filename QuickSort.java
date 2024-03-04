import java.util.Scanner;
public class QuickSort {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] sortedArr = quickSort(arr,0,n-1);
        for(int i=0; i<n; i++){
            System.out.print(sortedArr[i]+" ");
        }
    }

    public static int[] quickSort(int[] arr,int left,int right){
        //递归终止条件
        if(left >= right){
            return arr;
        }
        //设定分界值
        int p = arr[(left + right)/2];
        //设定两个扫描起点
        int i = left - 1;
        int j = right + 1;
        //开始扫描,直到i>=j停止
        while(i<j){
            while (arr[++i] < p);
            while (arr[--j] > p) ;
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //递归
        quickSort(arr, left, j);
        quickSort(arr, j+1, right);
        return arr;
    }
}

