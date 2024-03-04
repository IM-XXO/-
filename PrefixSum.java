import java.util.Scanner;
public class PrefixSum {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n+1];
        int[] s = new int[n+1];
        for(int i=1; i<n+1; i++){
            arr[i] = sc.nextInt();
            s[i] = s[i-1] + arr[i];
        }
        while(m-- > 0){
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println(s[r] - s[l-1]);
        }
    }
}
