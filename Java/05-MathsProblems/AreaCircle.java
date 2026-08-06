import java.util.*;
class AreaCircle{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius of circle:");
        double rad=sc.nextDouble();
        double area=Math.PI*rad*rad;//Math.PI
        System.out.println("area: "+area);

    }
}