//145
import java.util.*;
class Strongnum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int  a =sc.nextInt();
        int sum=0;
        int og=a;
        while(a!=0){
            int rem=a%10;
                    int fact=1;

            for(int i=1;i<=rem;i++){
                fact*=i;
            }
                            sum+=fact;

            a/=10;
        }
        if(og==sum)
            System.out.println("strong");
        else
            System.out.println("not");

    }

}