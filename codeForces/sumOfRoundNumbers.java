import java.util.*;

public class sumOfRoundNumbers {
      public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=0;i<num;i++){
            ArrayList<Integer> arr = new ArrayList();
            String str = sc.next();
            for(int j=0;j<str.length();j++){
                  if(str.charAt(j) != '0'){
                       int last_count = str.length()-1-j;
                       int n = (str.charAt(j) - '0') * (int) Math.pow(10,last_count);
                       arr.add(n); 
                  }   
             }
          
           System.out.println(arr.size());
           
           for(int a : arr){
            System.out.print(a + " ");
           }
        }
      }    
}
