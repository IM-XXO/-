/**
 *实现一个双链表，双链表初始为空，支持 5种操作：
 * 在最左侧插入一个数；
 * 在最右侧插入一个数；
 * 将第 k个插入的数删除；
 * 在第 k个插入的数左侧插入一个数；
 * 在第 k个插入的数右侧插入一个数
 * 现在要对该链表进行 M次操作，进行完所有操作后，从左到右输出整个链表。
 */
import java.util.Scanner;
public class LinkedList2 {

    static int[] e = new int[100010];
    static int[] r = new int[100010];
    static int[] l = new int[100010];
    static int idx;

   //删除第k个数
    public static void remove(int k){
        if(k+1>=e.length||r[k+1]>=e.length||l[k+1]>=e.length) return;
        l[r[k]] = l[k];
        r[l[k]] = r[k];
    }
    //在k的右侧加一个数
    public static void add(int k,int x){
        if(idx>=e.length) return;
        e[idx] = x;
        r[idx] = r[k];
        l[idx] = k;
        l[r[k]] = idx;
        r[k] = idx++;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        r[0] = 1;
        l[1] = 0;
        idx = 2;

        while(m-->0){
            String s = sc.next();
            char c = s.charAt(0);
            if(c == 'L'){
                int x = sc.nextInt();
                add(0,x);
            }else if(c == 'R'){
                int x = sc.nextInt();
                add(l[1],x);
            }else if(c == 'D'){
                int k = sc.nextInt();
                remove(k+1);//第k个插入的数下标是k+1
            }else if(s.equals("IR")){
                int k = sc.nextInt();
                int x = sc.nextInt();
                add(k+1,x);
            }else if(s.equals("IL")){
                int k = sc.nextInt();
                int x = sc.nextInt();
                add(l[k+1],x);
            }
        }
        for(int i=r[0]; i!=1; i=r[i]){
            System.out.print(e[i] + " ");
        }
    }
}
