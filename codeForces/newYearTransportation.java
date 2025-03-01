import java.util.*;

public class newYearTransportation {
      public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        
        int[] num = new int[n];
        for(int i=0;i<n-1;i++){
            num[i] = sc.nextInt();            
        }

        int pos = 1,nxt;

        while(pos<t){
            nxt = pos + num[pos-1];
            pos = nxt;   
        }

        if(pos == t){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }


      }    
}
