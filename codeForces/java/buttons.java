import java.util.*;

public class buttons {
      public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = num;
        
        for(int i=1;i<num;i++){
            ans += (num-i)*i;
        }
        
        System.out.println(ans);
      }    
}

