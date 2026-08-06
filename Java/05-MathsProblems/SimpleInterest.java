import java.util.*;
class SimpleInterest{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter principal amount:");
        double p=sc.nextDouble();
        System.out.println("enter time period:");
        int t=sc.nextInt();
        System.out.println("enter rate:");
        double r=sc.nextDouble();
        double si=(p*t*r)/100;
        System.out.println("simple interest:"+si);
        sc.close();

    }
}