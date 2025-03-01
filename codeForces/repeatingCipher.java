import java.util.*;

public class repeatingCipher {
      public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String s = sc.next();

        String res = "";
        int i=0;
        int len=1;

        while(i<num){
           res += s.charAt(i);
           i+=(len++);
        }
        
        System.out.println(res); 
      }    
}

