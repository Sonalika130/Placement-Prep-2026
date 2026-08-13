//O(n1)
// 1,2,3,4,5->2,3,4,5,1(1 remain so take place of 5 atlast)
//save the first element
//shift elements left
//put the saved at last
//rotation->nothing is lost,but shift means lost.
//shifting left-from left
import java.util.*;
public class LeftRotationBy1 {
    public static void leftRotate(int arr[]){
        //edge case-empty array
        if(arr.length==0)
            return;
    
        int temp=arr[0];//1st value will be lost forever to prevent overwritten
        for(int i=0;i<arr.length-1;i++){//index exception
            arr[i]=arr[i+1];

        }
        arr[arr.length-1]=temp;
        for(int i=0;i<arr.length;i++){
                    System.out.print(arr[i]+" ");


        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("after rotating left by 1");
        leftRotate(arr);

    }
    
}
