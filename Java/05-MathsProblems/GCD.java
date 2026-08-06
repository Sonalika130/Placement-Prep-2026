//largest positive number that divides both number without leaving any gap
//euclidean mehtod of swapping
//eg tile matching
import java.util.*;
class GCD{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int a =sc.nextInt();
        System.out.println("enter 2nd number:");
        int b=sc.nextInt();
        while(b!=0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        System.out.println("gcd :"+a);
             
        }

    }

    

