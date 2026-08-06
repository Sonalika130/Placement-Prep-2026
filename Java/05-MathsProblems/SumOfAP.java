import java.util.*;
public class SumOfAP {
    public static void main(String[] main){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number of series:");
        int a=sc.nextInt();
        System.out.println("enter difference between terms:");
        int d=sc.nextInt();
        System.out.println("enter number of total terms in an ap:");
        int n=sc.nextInt();
        double sum=(n/2)*((2*a)+(n-1)*d);
        System.out.println("sum of an ap series:"+sum);
    }
    
}
