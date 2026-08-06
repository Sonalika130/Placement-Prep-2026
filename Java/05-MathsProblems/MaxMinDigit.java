   
import java.util.*;
class MaxMinDigit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=Math.abs(sc.nextInt());//for negative
        int og=n;
        int maxDigit=0;
        int minDigit=9;
        if(n==0){
            System.out.println("max digit:"+(maxDigit==n));
            System.out.println("min digit:"+(minDigit==n));}
        else{
            while(n!=0){
                int digit=n%10;//extracting digit
                maxDigit=Math.max(maxDigit,digit);
                minDigit=Math.min(minDigit,digit);
                n/=10;//removing last digit

            }}
            System.out.println("max digit of "+ og+" is"+maxDigit);
                        System.out.println("min digit of "+ og+" is"+minDigit);


        }
            
        }
    

