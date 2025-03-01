import java.util.*;

public class presents {
      public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        int[] f_give_gift = new int[101];
        int[] f_receive_gift = new int[101];

        for(int i=0;i<test;i++){
            int num = sc.nextInt();
            f_give_gift[i] = num;
            f_receive_gift[num] = (i+1);
        }

        for(int i=1;i<=test;i++){
            System.out.print(f_receive_gift[i] + " "); 
        }
      }    
}
