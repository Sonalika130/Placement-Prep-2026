import java.util.*;
public class Power{
    public static int powerNum(int b,int e){
        int prod=1;
        while(e!=0){
            prod*=b;
            e--;


        }
        return prod;



    }public static void main(String args[]){
        System.out.println(powerNum(10,2));
    }

}