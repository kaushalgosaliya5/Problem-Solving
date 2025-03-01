import java.util.*;

public class chocolates {
      public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] num = new int[n];
        
        for(int i=0;i<n;i++){
            num[i] = sc.nextInt();
        }

        long res = num[n-1];

        for(int i=n-2;i>=0;i--){
            int t = Math.min(num[i+1]-1,num[i]);
            if(t<0) t = 0;
            num[i] = t;
            res += t; 
        }

        System.out.println(res);
      }    
}
