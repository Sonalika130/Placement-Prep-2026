import java.util.*;
public class FibonacciNth {
    public static void fibo(int n){//not int
        int first=0;
        int second=1;
        for(int i=1;i<=n;i++){
            System.out.println(first);
            int sum=first+second;
            first=second;

            second =sum;

        }
    }
    //another way
    public static int fibonacci(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        int a=0;
        int b=1;
        for(int i=2;i<=n;i++){
            int sum=a+b;
            a=b;
            b=sum;

        }
        return a;


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("fibonacci series of nth terms:");
        fibo(a);
        System.out.println(fibonacci(a));
    }
    
}
