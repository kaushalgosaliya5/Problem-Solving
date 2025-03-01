import java.util.*;

public class dreamoonAndStairs {
      public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int res = 0;

        if(m>n){
            res = -1;
        }else{
            if(n%2 != 0) res = n / 2 + 1;
            else res = n / 2;
            
            while(res % m > 0) res++;
        }

        System.out.println(res);

      }    
}

