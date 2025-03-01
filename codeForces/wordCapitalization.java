import java.util.*;

public class wordCapitalization {
      public static void main(String[] args){

         Scanner sc = new Scanner(System.in);
         String name = sc.next();
          
         name = (name.charAt(0)+"").toUpperCase() + name.substring(1);

         System.out.println(name);
      }    
}
