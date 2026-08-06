import java.util.*;
public class Avg5nos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 5 numbers: ");
        int a=sc.nextInt();
        double b=sc.nextDouble();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        double sum=a+b+c+d+e;
        double avg=sum/5;
        System.out.println("average of 5 nos is "+avg);



    }
    
}
