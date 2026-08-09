//concatenation of array-merging two arrays
//i.e.length=l(arr1)+l(Arr2)
//no two pointer
//t-O(n+m),O(n+m)-s
import java.util.*;
public class ConcatenationArray {
    //returning the array
    public static int[] concatenation(int arr1[],int arr2[]){
        //creating an array of length of sum of given 2 length
        int result[]=new int[arr1.length+arr2.length];
        //enter arr1 elements into resulting array
        for(int i=0;i<arr1.length;i++){
            result[i]=arr1[i];
        }
        //enter array 2 elements but at arr1.length index and keep incrementing the index
        //traversing through array 2 elemnts to enter
        for(int i=0;i<arr2.length;i++){
            //if length(1st)-2,then 2+0=2...
            result[arr1.length+i]=arr2[i];
        }
        return result;
        
    }
    public static void main(String args[]){
        int arr1[]={1,2,3};
        int arr2[]={7,8,9};
        int res[]=concatenation(arr1,arr2);
        System.out.println("concatenation of 2 ararys");
        System.out.println(Arrays.toString(res));


}
    
}
