import java.util.*;
public class SumDigits5nos {
    
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number:");
    int n=sc.nextInt();
    int sum=0;
    int ognum=n;
    while(n>0){
        int rem=n%10;
        sum+=rem;
        n/=10;

    }
    System.out.println("sum of digits of "+ognum+ " is "+sum);

}
}
