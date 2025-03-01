import java.util.*;

public class soldierAndBananas {
      public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();

        int total = 0;
        for(int i=0;i<w;i++){
            total += k*(i+1);
        }
        
        if(total>n){
            System.out.println(total-n);
        }else{
            System.out.println("0");
        }
      }    
}
