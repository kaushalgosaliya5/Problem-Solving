import java.util.*;

public class cityDay {
      public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        int[] days = new int[n];

        for(int i=0;i<n;i++) days[i] = sc.nextInt();

        for(int i=0;i<n;i++){
            boolean flag = false;

            for(int j=i-1;j>=i-x&&j>=0&&!flag;j--){
                if(days[j]<=days[i]) flag = true;
            }

            if(flag) continue;

            for(int j=i+1;j<n&&j<=i+y&&!flag;j++){
                  if(days[j]<=days[i]) flag = true;  
            }

            if(!flag){
                System.out.println(i+1);
                break;
            }
        }

      }    
}
