import java.util.*;
public class MultiplicatioinTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number for multiplication table");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++)
            System.out.println(+i+" x "+n + " = "+(i*n));
            //{
            //int res=n*i;
            //System.out.println(+i+" x "+n+ " = "+res);}
    
}}
