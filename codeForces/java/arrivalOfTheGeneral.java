import java.util.*;

public class arrivalOfTheGeneral {
      public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int lh = Integer.MIN_VALUE,li=0;
        int rh = Integer.MAX_VALUE,ri=0;
        int h=0;

        for(int i=0;i<num;i++){
             h = sc.nextInt();
            if(h>lh) {
                lh=h; li=i;
            }
            if(h<=rh) {
                rh=h; ri=i;
            }    
        }

        int res = li + num - 1 - ri;

        if(li<ri) System.out.println(res);
        else System.out.println(res-1);        
      }    
}
