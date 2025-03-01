import java.util.*;

public class diverseSubstring {
      public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String name = sc.next();
        boolean isSubString = false;
        for(int i=0;i<num-1;i++){
            if(Character.compare(name.charAt(i),name.charAt(i+1)) != 0){
                isSubString = true;
                name = name.charAt(i)+""+ name.charAt(i+1);
                break;
            }
        }

        if(isSubString){
            System.out.println("YES");
            System.out.println(name);  
        }else{
            System.out.println("NO");     
        }

      }    
}
