import java.util.*;
public class EvenOrOdd{
    public static void evenOdd(int n){//no int as return sopln,void to print
        if(n%2==0)
            System.out.println(+n+" is even");
        else
            System.out.println(+n+" is odd");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        evenOdd(n);
        evenOdd(12);
    }
}