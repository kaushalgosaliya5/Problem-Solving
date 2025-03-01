import java.util.*;

public class donutShops {
      public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        
        while(test-- > 0){
          long a = sc.nextInt();
          long b = sc.nextInt();
          long c = sc.nextInt();
          long f = - 1;
          long s = -1;

          if(a<c) f = 1;
          if(b*a>c) s = b;
         
          System.out.println(f + " " + s);
        }

      }    
}

