import java.util.*;
class Unary{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number");
        int x=sc.nextInt();
        int y=x++;
        System.out.println("value of y: "+y+" value of x: "+x);
        int z=++x;
        System.out.println("value of x: "+x+" value of y: "+y+" value of z: "+z);
        //similarly for prefix and postfix decrement--x,x--
    }
}