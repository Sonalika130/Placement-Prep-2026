import java.util.*;
class LeapYear{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a year:");
        int y=sc.nextInt();
        //normal like 2020 and centurian year like 1600
        if ((y%4==0 && y%100!=0)||(y%400==0))
        System.out.println(+y +" is a leap year");
        else
            System.out.println(+y+" is not a leap year");
        sc.close();
    }
}