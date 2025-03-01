import java.util.*;

public class beautifulMatrix {
      public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num[][] = new int[5][5];
        int r = 0,c = 0;

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                 num[i][j] = sc.nextInt();
                 if(num[i][j] == 1){
                    r = i;
                    c = j;        
                 }
            }
        }

        int ans = Math.abs(2-r) + Math.abs(2-c);
        System.out.println(ans);
      }    
}


