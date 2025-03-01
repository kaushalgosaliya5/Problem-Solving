import java.util.*;

public class fixYou {
      public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int text = sc.nextInt();
        
        while(text-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();

            String[] path = new String[n];
            int ans = 0;

            for(int i=0;i<n;i++){
                path[i] = sc.next();
            }

            for(int i=0;i<m;i++){
                if(path[n-1].charAt(i) == 'D') ans++;
            }

            for(int i=0;i<n;i++){
                if(path[i].charAt(m-1) == 'R') ans++;
            }

            System.out.println(ans);
        }

      }    
}
