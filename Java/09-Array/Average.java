import java.util.*;
public class Average {
    public static double average(int arr[]){
        int sum=0;
        if(arr.length==0)//edge case if length is o
            return 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }            
        //only sum/arr.length->intger division-10/4-2

        return (double)sum/arr.length;//does double division
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size:");
        int n=sc.nextInt();
        int []arr=new int[n];
            for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("average of the array elements:"+average(arr));
    }

    
}
