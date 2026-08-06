import java.util.*;
class PositiveNegative{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter:");
        int n=sc.nextInt();
        if (n>0)
            System.out.println(+n + " is a positive integer");
        else if(n<0)
            System.out.println(+n + " is a negative integer");
        else
            System.out.println(+n +  " is zero");

    }}