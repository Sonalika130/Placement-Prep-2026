import java.util.*;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int ognum=num;
        int count=0;
        if(num==0)
            count=1;
        else{
        while(num!=0){
            //int rem=num%10;no use
            num/=10;//with every div every no dropped count++
            count++;
        }}
        System.out.println("no of digits in "+ognum+" is "+count);
    }
}
