import java.util.*;


public class Sum2nos {
    public static double sumTwoNos(double a ,double b){
        //use of sum variable
        //double sum=a+b;
        //return sum;
        return a+b;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers:");
        double i =sc.nextDouble();
        double j=sc.nextDouble();
        double sum=sumTwoNos(10,20);
        System.out.println("Addition:"+sum);
        System.out.println("sum:"+(sumTwoNos(i,j)));
    }
    
}
