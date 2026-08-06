import java.util.*;
class PowerNum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter base:");
        int base=sc.nextInt();
        System.out.println("enter exponent:");
        int exponent=sc.nextInt();
        int result=1;
        int tempExp=exponent;
        while(exponent>0){
            result*=base;
            exponent--;
        }
        System.out.println(+base+ " to the power "+tempExp+ " is "+result);
        ;
    }
}