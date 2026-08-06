import java.util.*;
class Calculator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("enter operation want to perform(+,-,*,/,%):");
        char choice=sc.next().charAt(0);
                switch(choice){
            case '+':
                System.out.println("sum:"+(a+b));
                break;
            case '-':
                System.out.println("difference:"+(a-b));
                break;
            case '*':
                System.out.println("product:"+(a*b));
                break;
            case '/':
                System.out.println("division:"+(a/b));
                break;
            case '%':
                System.out.println("remainder/modulo:"+(a%b));
            default:
                System.out.println("enter valid choice");
        }
    }
}