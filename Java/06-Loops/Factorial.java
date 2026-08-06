import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entr a number:");
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++)
            fact*=i;
        System.out.println("factorial of"+n+ " is "+fact);

    }
    
}
