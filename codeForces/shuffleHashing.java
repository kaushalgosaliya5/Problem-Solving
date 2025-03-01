
import java.util.*;

public class shuffleHashing {
      public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        
        while(test-- > 0){

           String p = sc.next();
           String h = sc.next();
           String n;
           p = sortString(p);
           int n1 = p.length();
           int n2 = h.length();

           boolean flag = false;
           
           for(int i=0;i<=n2-n1;i++){
              n = h.substring(i, i+n1);
              n = sortString(n);    
              if(n.equals(p)){
                 flag = true;break;
              }
           }

           if(flag){
             System.out.println("YES");
           }else{
             System.out.println("NO");
           }

        }

      }    

      public static String sortString(String name){
         char[] tmp = name.toCharArray();
         Arrays.sort(tmp);
         String str = new String(tmp);
         return str;
      }
}
