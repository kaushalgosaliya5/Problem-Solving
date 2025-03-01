import java.util.*;

public class inSearchOfAnEasyProblem {
      public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isHard = false;
        for(int i=0;i<num;i++){
            int n = sc.nextInt();
            if(n == 1){
                isHard = true;
                break;
            }
        }
      
        if(isHard) System.out.println("HARD");
        else System.out.println("EASY"); 

      }    
}

