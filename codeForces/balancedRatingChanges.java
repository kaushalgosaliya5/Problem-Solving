import java.util.*;

public class balancedRatingChanges {
      public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        int[] num = new int[test];
        int odd = 0;

        for(int i=0;i<test;i++){
            num[i] = sc.nextInt();
            if(Math.abs(num[i]) % 2 == 1) ++odd;
        }

        odd = odd / 2;

        for(int n : num){
            if(Math.abs(n)%2 == 1){
               if(odd>0){
                  odd--;
                  n++;
               } else{
                  n--;
               }
            }
            System.out.println(n/2);
        }

      }    
}

