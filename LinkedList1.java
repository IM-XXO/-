/**
 * 实现一个单链表，链表初始为空，支持三种操作：
 * 向链表头插入一个数；
 * 删除第 k个插入的数后面的一个数；
 * 在第 k个插入的数后插入一个数。
 * 现在要对该链表进行 M次操作，进行完所有操作后，从头到尾输出整个链表。
 */
import java.util.Scanner;
public class LinkedList1 {
    static int[] e = new int[100010];
    static int[] ne = new int[100010];
    static int idx,head;
    //初始化头结点
    public static void init(){
        idx = 0;
        head = -1;
    }
//向链表头插入一个数x
    public static void add_head(int x){
        e[idx] = x;
        ne[idx] = head;
        head = idx++;
    }
//在第k位数后面插入一个数x
    public static void add(int k,int x){
        e[idx] = x;
        ne[idx] = ne[k];
        ne[k] = idx++;
    }
//删除第k个数后面的数
    public static void remove(int k){
        ne[k] = ne[ne[k]];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        init();
        while(m-->0){
            //java中没有单独输入字符的功能，所以字符串转字符。
            String s = sc.next();
            char op = s.charAt(0);
            if(op == 'H'){
                int x = sc.nextInt();
                add_head(x);
            }else if(op == 'D'){
                int k = sc.nextInt();
                if(k == 0) head = ne[head];
                else remove(k-1);//第k个插入的数下标是k-1
            }else{
                int k = sc.nextInt();
                int x = sc.nextInt();
                add(k-1,x);//第k个插入的数下标是k-1
            }
        }
        for(int i=head; i!=-1; i = ne[i]){
            System.out.print(e[i] + " ");
        }
    }

}
