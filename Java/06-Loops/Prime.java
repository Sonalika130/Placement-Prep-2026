import java.util.*;
class Prime{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=sc.nextInt();
        boolean isPrime=true;
        if(num<=1){
            isPrime=false;
            System.out.println("not prime number");}
        else{
            for(int i=2;i<=num;i++){
                if(num%i==0)
                    isPrime=false;
                break;

        }}
        if(isPrime)
            System.out.println(num+" is prime");
        else
            System.out.println("not prime");
        }
    }
