import java.util.*;

public class kString {
      public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String name = sc.next();
        
        int[] arr = new int[26];

        for(char ch : name.toCharArray()){
            int index = ch-'a';
            arr[index] = ++arr[index];
        }

        String res = "";

        boolean isKString = true;
        for(int i=0;i<26;i++){
             if(arr[i] % k != 0){
                isKString = false;
                break;
             }else{
                int times = arr[i]/k;
                while(times-->0) res += (char)('a'+i); 
             }
        }

        if(isKString){
            String old = res;
            while(--k>0) res += old;       
            System.out.println(res);
        }else{
            System.out.println(-1);
        }
      }    
}
