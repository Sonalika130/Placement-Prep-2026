import java.util.*;

public class EvennostillN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no(N):");
        int n=sc.nextInt();
        System.out.println("even nos till N");
        for(int i=0;i<=n;i++){
            if(i%2==0)//alone if can be used else is unnecessarry
                System.out.print(i + " ");
            
        }
        System.out.println("\nalso even number till n:");
        for(int i=0;i<=n;i+=2){
            System.out.print(i+ " ");
        }

    }
    
}
