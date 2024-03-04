import java.util.Scanner;
public class MergeSort {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        mergeSort(arr,0,n-1);
        for(int j=0;j<n;j++){
            System.out.print(arr[j]+" ");
        }
    }
    public static void mergeSort(int[] arr,int l,int r){
        //递归出口
        if(l>=r){
            return;
        }
        //分界线
        int mid = (r+l)/2;
        //递归
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        //新建数组
        int[] temp = new int[r-l+1];
        //分成两部分扫描，依次把小的放进去
        int k = 0;
        int i = l;
        int j = mid+1;
        while(i<=mid&&j<=r){
            if(arr[i]<=arr[j]){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
            }
        }
        //把剩余未处理的新数组后面
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=r){
            temp[k++] = arr[j++];
        }
        //把临时数组再倒到原数组里去
        for(int m=l,n=0;m<=r;m++,n++){
            arr[m] = temp[n];
        }
    }
}
