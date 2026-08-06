import java.util.*;
class PrimeFactor{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int a=sc.nextInt();
        for(int i=2;i*i<=a;i++){
            while(a%i==0){
                System.out.println(i);
                a/=i;
            }
            

        }
        if(a>1)
                System.out.println(+a);

    }
}