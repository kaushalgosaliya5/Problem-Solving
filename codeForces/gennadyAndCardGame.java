import java.util.*;

public class gennadyAndCardGame {
      public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String card = sc.next();
        String[] hands = new String[5];

        for(int i=0;i<5;i++){
            hands[i] = sc.next();
        }

        boolean flag = false;
        for(int i=0;i<hands.length;i++){
             if(hands[i].charAt(0) == card.charAt(0) || hands[i].charAt(1) == card.charAt(1)){
                flag = true;break;
             }  
        }

        if(flag) System.out.println("YES");
        else System.out.println("NO");

      }    
}
