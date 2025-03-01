import java.util.*;

public class erasingZeroes {
      public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        String str = "";
        
        while(test-- > 0){
            str = sc.next();
            int prev = -1;
            int res = 0;

            for(int i=0;i<str.length();i++){
                   if(str.charAt(i) == '1') {
                        if(prev != -1) res += (i-prev-1);
                        prev=i;
                   }      
            }
            
            System.out.println(res);            
        }

      }    
}
