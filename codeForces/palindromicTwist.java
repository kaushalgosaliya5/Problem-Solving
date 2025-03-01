import java.util.*;

public class palindromicTwist {
      public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        while(test-->0){
            int n = sc.nextInt();
            String s = sc.next();

            int i=0, j=n-1;
            
            while(i<=j){
                char x = s.charAt(i);
                char y = s.charAt(j);

                char p1 = (char) ((Character.compare(x,'a') == 0) ? '1' : x-1);
                char p2 = (char) ((Character.compare(y,'a') == 0) ? '1' : y-1);

                char n1 = (char) ((Character.compare(x,'z') == 0) ? '2' : x+1);
                char n2 = (char) ((Character.compare(y,'z') == 0) ? '2' : y+1);
                
                if(p1 == p2 || p1 == n2){
                    i++;j--;
                }else if(p2 == p1 || p2 == n1){
                    i++;j--;
                }else{
                    break;
                }
            }

            if(i>j) System.out.println("YES");
            else System.out.println("NO");
        }

      }    
}
