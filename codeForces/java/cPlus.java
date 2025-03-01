import java.util.*;

public class cPlus {
      public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        while(test-- > 0){
           int a = sc.nextInt();
           int b = sc.nextInt();
           int total = sc.nextInt();
           int count = 0;
           while(a<=total && b<=total){
                int c = a+b;
                if(a<b) a = c;
                else b = c;
                count++;
           }
         
           System.out.println(count);
        }

      }    
}