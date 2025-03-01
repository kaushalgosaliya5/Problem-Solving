import java.util.*;

public class cAPSlOCK {
      public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        boolean allUpper = true;
         
        String subString = name.substring(1);
        for(char ch : subString.toCharArray()) allUpper = allUpper && Character.isUpperCase(ch);

        if(allUpper || name.length() == 1){
             String tmp = subString.toLowerCase();
             if(Character.isUpperCase(name.charAt(0))){
                  name = (name.charAt(0)+"").toLowerCase() + tmp; 
             }else{
                name = (name.charAt(0)+"").toUpperCase() + tmp;
             }
        }

        System.out.println(name);
        
      }    
}
