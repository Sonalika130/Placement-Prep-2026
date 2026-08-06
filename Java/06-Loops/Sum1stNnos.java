import java.util.*;

public class Sum1stNnos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no(N):");
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++)
            sum+=i;
        System.out.println("sum of first " +n+" numbers: "+sum);


    
    }
    
}
