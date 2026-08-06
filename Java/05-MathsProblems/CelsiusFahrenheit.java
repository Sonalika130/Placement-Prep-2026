import java.util.*;
public class CelsiusFahrenheit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter temperature in celsius");
        double temp=sc.nextDouble();
        double fahr=(temp*9.0/5.0)+32;//(9/5)->gives 56 which is wrong
        System.out.println("temp in celsius to fahreneit:"+fahr);

    }
    
}
