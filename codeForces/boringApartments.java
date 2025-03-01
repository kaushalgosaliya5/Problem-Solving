import java.util.*;

public class boringApartments {
      public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        int n = 0;

        while(test-->0){
           n = sc.nextInt();
           int digit = n % 10;
           int res = 0;
           res = (digit-1)*10;
           int num = digit;
           int i = 1;
           while(num<=n){
             res+=(i++);
             num = num*10+digit;
           }

           System.out.println(res);
        }

      }    
}

