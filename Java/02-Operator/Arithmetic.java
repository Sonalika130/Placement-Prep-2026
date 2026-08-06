import java.util.*;
class Arithmetic{
    public static void main(String[] args){
        System.out.print("enter first number:");
        Scanner sc=new Scanner(System.in);
        double n1=sc.nextDouble();
        System.out.print("enter 2nd number");
        double n2=sc.nextDouble();
        System.out.println("summation="+(n1+n2));
        System.out.println("subtraction: "+(n1-n2));
        System.out.println("product: "+(n1*n2));
        if(n2!=0)
            System.out.println("division: "+(n1/n2));
        else
            System.out.println("invalid");
        if(n2!=0)//cant be divided with zero
            System.out.println("modulo: "+(n1%n2));
        else
            System.out.println("invalid");
    }
}