import java.util.*;//p*Math.pow((1+r/100),t)

public class CompoundIntBasic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter prinicpal amount:");
        int p=sc.nextInt();
        System.out.println("enter time period:");
        int t=sc.nextInt();
        System.out.println("enter rate of interest:");
        double r=sc.nextDouble();
        double amount=p*Math.pow((1+r/100),t);
        double ci=amount-p;
        System.out.println("coumpound interest:"+ci);
}}
