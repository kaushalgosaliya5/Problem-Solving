import java.util.*;

public class tram {
      public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        int res = 0;
        int cnt = 0;
        for(int i=0;i<test;i++){
            int exit = sc.nextInt();
            int entry = sc.nextInt();
            cnt -= exit;
            cnt += entry;
            res = Math.max(res,cnt);
        }

        System.out.println(res);
      }    
}

