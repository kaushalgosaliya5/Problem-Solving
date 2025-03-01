import java.util.*;

public class softDrinking {
      public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();

        int td = k*l;
        int tl = c*d;
        int x = td / (n*nl);
        int y = tl / n;
        int z = p / (n*np);

        int ans = Math.min(x,Math.min(y,z));
        System.out.println(ans);
        
      }    
}
