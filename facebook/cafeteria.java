package facebook;

import java.util.*;

public class cafeteria {
    
    public static long getMaxAdditionalDinersCount(long N, long K, int M, long[] S) {
        // Write your code here
        double extraSpace = 0,firstOpenSeat = 1,openSeats = 0;
        
        Arrays.sort(S);
       
        for(long takenSeats : S){
              // 4   
             openSeats = takenSeats - firstOpenSeat - K;
             if(openSeats > 0){
                 extraSpace += Math.ceil(openSeats/(K+1));
             }
                
             firstOpenSeat = takenSeats + K + 1;         
        
        }  
        
        openSeats = N + 1 - firstOpenSeat;
        
        if(openSeats > 0){
               extraSpace += Math.ceil(openSeats/(K+1));
        }
        
        return (long) extraSpace;
      }
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        long[] tmp = new long[]{2,6};
        getMaxAdditionalDinersCount(10,1,2, tmp);
      }    
}