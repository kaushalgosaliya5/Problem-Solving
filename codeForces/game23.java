import java.util.*;

public class game23 {
      public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int res = -1;

        if(n == m){
           res = 0;    
        }else if(m%n == 0){
            res = 0;
            int d = m/n;
            while(d%2==0) {
                d/=2; res++;
            }
            while(d%3==0) {
                d/=3; res++;
            }
            if(d != 1) res = -1; 
        }

        System.out.println(res);
        
      }    
}

