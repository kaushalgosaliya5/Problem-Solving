import java.util.*;

public class foxAndSnake {
      public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
    
            int m = sc.nextInt();
            int n = sc.nextInt();
            int dir = 0;

            for(int j=0;j<m;j++){
                for(int k=0;k<n;k++){
                    if(j%2==0){
                        System.out.print("#");
                    }else{
                        if(dir == 0){
                          if(k==n-1) System.out.print("#");
                          else System.out.print(".");
                        }else{
                            if(k==0) System.out.print("#");
                            else System.out.print(".");  
                        }
                    }
                }
                if(j%2!=0) dir=1-dir;
                System.out.println("");
            } 
             
      }    
}
