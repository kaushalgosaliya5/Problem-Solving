import java.util.*;

public class antonPolyhedrons {
   
      public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        int sum = 0;

        for(int i=0;i<test;i++){
             String name = sc.next();

             if(name.equals("Tetrahedron")){
                 sum += 4;
             }else if(name.equals("Cube")){
                sum += 6;
             }else if(name.equals("Octahedron")){
                sum += 8;
             }else if(name.equals("Dodecahedron")){
                sum += 12;
             }else if(name.equals("Icosahedron")){
                sum += 20;
             }
        }

        System.out.println(sum);
      }    
} 

