import java.util.*;

public class oRInMatrix {
      public static void main(String[] args){

       Scanner sc = new Scanner(System.in);
       int r = sc.nextInt();
       int c = sc.nextInt();
       int[][] a = new int[r][c];
       int[][] b = new int[r][c];

       for(int i=0;i<r;i++){
         a[i] = new int[c];
         b[i] = new int[c];
       }

       for(int i=0;i<r;i++){
          for(int j=0;j<c;j++){
             a[i][j] = 1;    
          }
       }

       for(int i=0;i<r;i++){
         for(int j=0;j<c;j++){
            b[i][j] = sc.nextInt();
            if(b[i][j] == 0){
                for(int k=0;k<c;k++){
                    a[i][k] = 0;
                }
                for(int k=0;k<r;k++){
                    a[k][j] = 0;
                }
            }   
         }
       } 

       boolean isFlag = true;

       for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
             if(b[i][j] == 1){
                  int sum = 0;
                  for(int k=0;k<r;k++) sum += a[k][j];
                  for(int k=0;k<c;k++) sum += a[i][k];
                  if(sum == 0){
                     isFlag = false;break;
                  }
             }
        }
      }

      if(isFlag) {
        System.out.println("YES");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
      }else{
        System.out.println("NO");
      } 
       
        
      }    
}
