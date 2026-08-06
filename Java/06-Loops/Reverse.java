import java.util.*;
class Reverse{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        int ogno=n;
        int rev=0;
        while(n!=0){//so that both +ve -ve no can be reversed
            int rem=n%10;
            rev=(rev*10)+rem;
            n/=10;



        }
        System.out.println("reverse of "+ogno+ " is "+rev);
    }
}