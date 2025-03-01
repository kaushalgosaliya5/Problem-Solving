import java.util.*;

public class chewbaccaNumber {
      public static void main(String[] args){

            Scanner sc = new Scanner(System.in);
            String num = sc.next();

            for(int i=0;i<num.length();i++){
                  char ch = num.charAt(i);
                  if(i == 0 && ch >= '5' && ch < '9'){
                       ch = (char) ('9' - ch + '0');
                  }else if(i>=1 && ch >= '5'){
                       ch = (char) ('9' - ch + '0');
                  }
                  num = num.substring(0,i) + ch + num.substring(i+1);
            }

            System.out.println(num);
        
      }    
}