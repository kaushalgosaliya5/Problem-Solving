import java.util.*;

public class assigningToClasses {
      public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        
        while(test-- > 0){
            
            int n = sc.nextInt();
            int num[] = new int[n*2];
            
            for(int i=0;i<n*2;i++){
                num[i] = sc.nextInt();
            }

            Arrays.sort(num);

            int ans = Math.abs(num[n-1] - num[n]);
            System.out.println(ans);
        }

      }    
}

