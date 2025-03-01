import java.util.*;

public class bitPlus {

    public static void main(String args[]){

        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            int count = 0;
            while(num-- > 0){
                String value = sc.next();
                if(value.equals("X++") || value.equals("++X")){
                    count++;
                }else{
                    count--;
                }
            }

            System.out.println(count);
        }
    }
    
}
