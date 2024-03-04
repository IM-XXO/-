/**
 *
 */

import java.util.Scanner;
public class MergeSort2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(mergeSort(arr,0,n-1));
        /*
        int sum = 0;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[i]){
                    sum++;
                }
            }
        }
        System.out.println(sum);
         */
    }
    public static long mergeSort(int[] arr,int l,int r){
        if(l>=r){
            return 0;
        }
        int mid = (l + r)/2;
        long res = mergeSort(arr,l,mid) + mergeSort(arr,mid+1,r);
        int[] temp = new int[r-l+1];
        int k = 0;
        int i = l;
        int j = mid + 1;
        while(i<=mid&&j<=r){
            if(arr[i]<=arr[j]){
                temp[k++] = arr[i++];
            }else{
                res+= mid - i +1;
                temp[k++] = arr[j++];
            }
        }
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=r){
            temp[k++] = arr[j++];
        }
        for(int m=l,n=0;m<=r;m++,n++){
            arr[m] = temp[n];
        }
        return res;
    }
}
