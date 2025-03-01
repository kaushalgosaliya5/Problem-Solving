import java.util.*;

public class middleOfTheContest {
      public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String time1 = sc.next();
        String time2 = sc.next();
        
        String[] strTime1 = time1.split(":");
        String[] strTime2 = time2.split(":");
        
        int h1 = Integer.parseInt(strTime1[0]);
        int m1 = Integer.parseInt(strTime1[1]);        

        int h2 = Integer.parseInt(strTime2[0]);
        int m2 = Integer.parseInt(strTime2[1]);   
        
        int min1 = h1*60 + m1;
        int min2 = h2*60 + m2;

        int avgMin = (min1 + min2) / 2;

        int h = avgMin/60;
        int m = avgMin%60;

        if(h>10 && m>10){
             System.out.println(h+":"+m);
        }else{
            if(h<10) System.out.print("0");
            System.out.print(h+":");
            if(m<10) System.out.print("0");
            System.out.print(m);
        }
      }    
}