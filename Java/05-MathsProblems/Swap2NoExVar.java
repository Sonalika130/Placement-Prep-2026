import java.util.*;
public class Swap2NoExVar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st (A) no:");
        int a=sc.nextInt();
        System.out.println("enter2nd (B) no:");
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swapping");
        System.out.println("value of A is "+a+" value of B is "+b); 
        
    }
    
}
