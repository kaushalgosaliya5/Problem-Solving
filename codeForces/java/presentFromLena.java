import java.util.*;

public class presentFromLena {
      public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int row=-n;row<=n;row++){
             
            int spaces = 2 * Math.abs(row);
            for(int i=0;i<spaces;i++) System.out.print(" ");
            int max = n - Math.abs(row);
            for(int i=0;i<max;i++) System.out.print(i + " ");
            for(int i=max;i>0;i--) System.out.print(i + " ");

           System.out.println(0);
        }

      }    
}

