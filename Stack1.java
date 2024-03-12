/**
 * 实现一个栈，栈初始为空，支持四种操作：
 * push x – 向栈顶插入一个数 x；
 * pop – 从栈顶弹出一个数；
 * empty – 判断栈是否为空；
 * query – 查询栈顶元素。
 * 现在要对栈进行 M个操作，其中的每个操作 3和操作 4都要输出相应的结果。
 */
import java.util.Scanner;
public class Stack1 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        int[] stl = new int[100010];//数组模拟栈
        int tt = 0;
        while(m-->0){
            String s = sc.next();
            if(s.equals("push")){
                int x = sc.nextInt();
                stl[++tt] = x;
            }else if(s.equals("pop")){
                tt--;
            }else if(s.equals("empty")){
                if(tt > 0){
                    System.out.println("NO");
                }else{
                    System.out.println("YES");
                }
            }else{
                System.out.println(stl[tt]);
            }
        }
    }
}
