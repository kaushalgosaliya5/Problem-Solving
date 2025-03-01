import java.util.*;

public class maximumIncrease {
      public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];

        for(int i=0;i<n;i++){
            num[i] = sc.nextInt();
        }

        int l=0,r=1;
        int res=1;

        while(r<n){
            if(num[r]>num[r-1]){
               res = Math.max(res,r-l+1);
               r++;
            }else{
                l=r;
                r++;
            }
        }
        
        System.out.println(res);

      }    
}
