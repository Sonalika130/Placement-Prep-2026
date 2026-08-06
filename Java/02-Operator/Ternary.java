import java.util.*;
class Ternary{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("entr a number:");
        int a =sc.nextInt();
        boolean st=a%2==0?true:false;
        System.out.println("even(true) or odd(false):"+st);
    }
}