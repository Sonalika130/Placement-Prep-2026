import java.util.*;
class PerimeterRect{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length:");
        double l=sc.nextDouble();
        System.out.println("enter width:");
        double w=sc.nextDouble();
        double perimeter=2*(l+w);
        System.out.println("perimetr:"+perimeter);
    }
}