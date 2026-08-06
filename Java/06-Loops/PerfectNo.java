import java.util.*;//6,28,496


public class PerfectNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<=num/2;i++)//a no cant have factor<=no/2,largest factor is its halfor less than excluding 1.
        {
            if(num%i==0)
                sum+=i;

        }
        if(sum==num&&num>0)
            System.out.println(num+" is a perfect number");
        else
            System.out.println(num+" is not a perfectnumber");

    }
    
}
