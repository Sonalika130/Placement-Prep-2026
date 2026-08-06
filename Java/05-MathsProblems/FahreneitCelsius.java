import java.util.*;
public class FahreneitCelsius {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter temperatur ein fahreneit");
        double f=sc.nextDouble();
        double cel=(f-32)*5/9;
        System.out.println("temp in celsius:"+cel);

    }
    
}
