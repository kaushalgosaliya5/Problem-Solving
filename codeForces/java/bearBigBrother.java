import java.util.*;

public class bearBigBrother {
      public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int bear = sc.nextInt();
        int bob = sc.nextInt();
        int count = 0;

        while(bear<=bob){
            bear = 3*bear;
            bob = 2*bob;
            count++;
        }
        
        System.out.println(count);
      }    
}

