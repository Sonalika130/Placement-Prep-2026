import java.util.*;

public class Max2nos {
    public static int maxOfTwoNos(int a,int b){
        //return Math.max(a,b);
        if(a>=b)
            return a;
        else
            return b;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int max=maxOfTwoNos(23,44);
        System.out.println("maximum:"+max);
                System.out.println("maximum:"+maxOfTwoNos(a,b));

    }
    
}
