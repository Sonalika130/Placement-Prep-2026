import java.util.*;
public class Factors {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int a =sc.nextInt();
            //normal approach

        System.out.println("factors:");//using loop
        for(int i=1;i<=a;i++){
            if(a%i==0)
                System.out.println(i);}

            //using optimised one
             System.out.println("factors(optimised way):");
        for(int j=1;j<=Math.sqrt(a);j++){
            if(a%j==0){
                                System.out.println(j);

                if(j != a/j)
                    System.out.println(a/j);
                
                }
            }
        
            }

        }

        

    

