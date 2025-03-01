import java.util.*;

public class vanyaAndCubes {
      public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int level = 0;

        while(true){
             n -= sum(level+1);
             if(n>=0) level++;
             else break;
        }

        System.out.println(level);
      }    

      public static int sum(int num){
        return num * (num+1) / 2;
      }
}
