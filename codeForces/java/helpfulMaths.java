import java.util.*;

public class helpfulMaths {
      public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String numSum = sc.next();
        int[] count = new int[3];

        for(char num : numSum.toCharArray()){
             if(Character.compare(num,'1') == 0) count[0] = ++count[0];
             if(Character.compare(num,'2') == 0) count[1] = ++count[1];
             if(Character.compare(num,'3') == 0) count[2] = ++count[2];
        }

        String ans = "";
        for(int i=0;i<3;i++){
            while(count[i]-- > 0){
                ans += "+" + (i+1);
            }
        }

        System.out.println(ans.substring(1));
      }    
}

