import java.util.*;
class Vote{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ur age: ");
        int age=sc.nextInt();
        if(age>=18)
            System.out.println("u can cast vote");
        else if(age>=0){
            int remaining=18-age;
            System.out.println("not eligible but can cast in "+remaining+"years");
        
        }
        else{
            System.out.println("enter ur valid age!!");
        }


    }
}