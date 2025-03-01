import java.util.*;

public class boyOrGirl {
      public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        HashSet<Character> hs = new HashSet<>();

        for(char s : name.toCharArray()){
            hs.add(s);
        }

        if(hs.size() % 2 == 0){
           System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");    
        }
      }    
}

