 import java.util.*;
public class Prime {

public static boolean isPrime(int n){
    if(n<=1)
        return false;
    for(int i=2;i<=n/2;i++){
        if(n%i==0)
            return false;
    }
    return true;
}
public static void main(String[] args) {
    

    System.out.println("enter no");
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    boolean st=isPrime(20);//no string only boolean
    System.out.println(st);

    System.out.println("prime :"+isPrime(m));
}}
