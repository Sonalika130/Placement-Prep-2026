import java.util.*;

public class Largest2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entr 2 numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b)
            System.out.println(+a+" is greater than "+b);
        else if (b>a)
            System.out.println(+b+ " is greater than "+a);
        else
            System.out.println(+a+" is qual to "+b);
        String res=(a>b)?"greater":"smaller";
        System.out.println(res);

    }
    
}
