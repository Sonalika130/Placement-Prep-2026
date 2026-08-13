//concatenation of a single array-{1,2}-{1,2,1,2}
// //stored in another array
//use of twice of length
//0indexed,t-O(n),s-O(1)
import java.util.*;
public class ConcatenationSelf {
    public static int[] concatenation(int arr[]){
        int result[]=new int[2*arr.length];//storemsame elemnt again
        //scanning through given array
        for(int i=0;i<arr.length;i++){
            //storing in the array
            result[i]=arr[i];//upto given array
            result[arr.length+i]=arr[i];//concatenation
        }
        //new array
        return result;
    }
    public static void main(String[] args){
        int arr1[]={1,3,2,1};
        System.out.println(Arrays.toString(concatenation(arr1)));
    }
    
}
