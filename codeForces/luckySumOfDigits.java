import java.util.*;

public class luckySumOfDigits {
      public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = "";

        while(num>0 && num%7!=0) {
            num -= 4;
            str += "4";
        }

        while(num>0 && num%7==0){
            num -= 7;
            str += "7";
        }

        if(num == 0) System.out.println(str);
        else System.out.println("-1");

      }    
}
