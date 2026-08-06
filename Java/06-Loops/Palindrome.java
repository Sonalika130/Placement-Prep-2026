import java.util.*;//121,11

public class Palindrome {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number:");
    int num=sc.nextInt();
    int ognum=num;
    int rev=0;
    while(num!=0){
        int rem=num%10;//lastdigit
        rev=(rev*10)+rem;
        num/=10;


    }
    if(rev==ognum)
        System.out.println(+ognum+ " is palindrome");
    else
        System.out.println(+ognum+" is not palindrome number");
 }   
}
