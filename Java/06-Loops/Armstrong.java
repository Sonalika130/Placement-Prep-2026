import java.util.*;
class Armstrong{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        if(n==0){
            System.out.println("armstrong number");
            return;
        }
        int num=n;
        int sum=0;
        int count=0;
        while(n!=0){
            n/=10;
            count++;
        }n=num;
        while(n!=0){
            int rem=n%10;
            sum+=(int)Math.pow(rem,count);
            n/=10;
        }
        if(num==sum&&num>0)
            System.out.println(num+" is armstrong");
        else
            System.out.println("not armstrong");
    }
}