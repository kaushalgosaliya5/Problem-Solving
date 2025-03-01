import java.util.*;

public class stringTask {
      public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String ans = "";
        for(char ch : name.toCharArray()){
             if(ch != 'A' && ch != 'a' && ch != 'O' && ch != 'o' && 
                ch != 'Y' && ch != 'y' && ch != 'E' && ch != 'e' &&
                ch != 'U' && ch != 'u' && ch != 'I' && ch != 'i'){
                   ans += '.' + (ch +"").toLowerCase(); 
                }
        }

        System.out.println(ans);

      }    
}
