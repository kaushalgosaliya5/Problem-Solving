import java.util.*;

public class petrBook {
      public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int pages = sc.nextInt();       
        int num[] = new int[7];

        for(int i=0;i<7;i++){
            num[i] = sc.nextInt();
        }
        
        int i = 0;
        while(pages>0){
            pages -= num[i];
            if(pages<=0)break;
            i++;
            i = i%7;
        }

        System.out.println(i+1);

      }    
}

