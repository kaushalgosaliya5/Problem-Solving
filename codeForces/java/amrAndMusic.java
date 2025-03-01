import java.util.*;

public class amrAndMusic {
      public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        HashMap<Integer,Integer> num = new HashMap<Integer,Integer>();       
         
        for(int i=0;i<n;i++){
            int temp = sc.nextInt();
            num.put(temp,i+1); 
        }

        ArrayList<Integer> sortedList = new ArrayList<Integer>(num.keySet());
        Collections.sort(sortedList);

        int days = 0;
        int cnt = 0;
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int list : sortedList){
              days += list;
            if(days<=k){
                cnt++;
                res.add(num.get(list)); 
            }else{
                break;
            }
        }

         System.out.println(cnt); 
         for(int r : res){
            System.out.print(r + " ");
         } 

      }    
}
