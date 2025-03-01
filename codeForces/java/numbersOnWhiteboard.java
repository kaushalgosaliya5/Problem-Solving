import java.util.*;

public class numbersOnWhiteboard {
      public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        
        while(test-- > 0){
            
            int n = sc.nextInt();
            ArrayList num = new ArrayList<>();
            for(int i=1;i<=n;i++){
                num.add(i);
            }

            ArrayList<Integer> res = new ArrayList<>();
            
            while(num.size()>1){
               int len = num.size();
               int sum = ((int) num.get(len-1) + (int) num.get(len-2));
               
               res.add((int) num.get(len-1));
               res.add((int) num.get(len-2));

               num.remove(len-1);
               num.remove(len-2);
               
               if(sum%2==1){
                  num.add(sum/2+1);    
               }else{
                  num.add(sum/2);    
               }
            }

            System.out.println(num.get(0));
            int index = 0;
            for(int r : res){
               if(index % 2 == 0){
                System.out.print(r +" ");
               }else{
                System.out.println(r);
               } 
               index++;
            }
        }

      }    
}
