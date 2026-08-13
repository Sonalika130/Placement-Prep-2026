import java.util.*;
public class ArrayBasic{

    public static void main(String args[]){
        //normal style of accepting input
        int arr[]=new int[3];//size already known
        //accepting also without assigning it initialises with zero
        arr[0]=98;
        arr[1]=87;
        arr[2]=67;
        //sopln(arr[])//garbage value
        System.out.println(arr[0]);//displaying
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        //another way
        int a[]={1,2,3,4,5};//already given/known
        //displaying 
        
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        //another way-taking inputs from user
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array:");
        int n=sc.nextInt();//n=arr.length also be used
        int array[]=new int[n];
        System.out.println("entr the values");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        //displaying third array
        System.out.println("the entered array is");
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }


    }
    
}
