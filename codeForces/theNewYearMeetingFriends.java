import java.util.*;

public class theNewYearMeetingFriends {
      public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int[] num = new int[3];


        num[0] = sc.nextInt();
        num[1] = sc.nextInt();
        num[2] = sc.nextInt();

        Arrays.sort(num);

        int ans = Math.abs(num[1]-num[0]) + Math.abs(num[2]-num[1]);
        System.out.println(ans);
        
      }    
}

