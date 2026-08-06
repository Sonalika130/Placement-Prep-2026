import java.util.*;
class Swap2ns3var{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st no(A):");
        int a=sc.nextInt();
        System.out.println("enter 2nd no(B):");
        int b=sc.nextInt();
        int temp=a;
        a=b;
        b=temp;
        System.out.println("after swapping");
        System.out.println("A is "+a+" and B is "+b);


    }
}