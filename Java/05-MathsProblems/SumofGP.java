import java.util.*;//gp-a,ar,ar^2,ar^3,..,if a=2,b=3,r=3/2
public class SumofGP {//sum of gp-a+ar+ar^2+ar^3+ar^4...,if r=1 then Sn=(n*a),if -1<r<1(infinite series),Sn=a/1-r,if r!=1,a(1-r^n)/1-r
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("");
        System.out.println("enter ratio in gp series:");
        double r=sc.nextDouble();
        
        System.out.println("enter first number of gp series:");
        double a=sc.nextDouble();
        System.out.println("enter number of terms and enter(n==0)if its infinite series:");
        int n=sc.nextInt();
        
         if (r<1 && r>-1 &&n==0){
            double sum=a/(1-r);       
                 System.out.printf("gp sum of an infinite series is %.4f%n",sum);}//string formatting
        
        else if(r!=1&&n!=0){//if r!=1
            double sum=a*((1-(Math.pow(r,n)))/(1-r));
        System.out.println("gp sum of an finite series,r!=1 is"+sum);

        }
        else{
            double sum=a*n;
            System.out.printf("gp sum (r==1) is"+sum);}
            }
        }
    

    

