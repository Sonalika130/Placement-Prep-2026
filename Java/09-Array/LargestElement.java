import java.util.*;
public class LargestElement{
    public static int largestNo(int arr[]){
        //if array is empty->edge case
        //if(arr.length==0)
        //{
           // return 0;
        //}
//acts for both +ve and -ve number unlike max=0
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
                
        }
        return max;
        

        
    }
    public static void main(String args[]){
        //int arr[]={};throws error
        int arr[]={1,23,45,67,89,45};
        int max=largestNo(arr);
        System.out.println("largest element is:"+max);


    }

}