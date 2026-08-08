//Kadens algorithm(contiguous)
//so before 4 it hurts our sum and after 6 its same so ans is like that
//dynamic approach+greedy idea as,
//it keeps track fo prev res
//makes local decision to discard -ve running sum,
//while keeping best answer so far
//t-O(n),O(1)-onlt 2 variables
//currentsum,maxsum
//at every new element,
//check if the element or its sum with currrentsum better 
//and store the better in currentsum
//keep track of best currentsum oever at maxsum 
import java.util.*;
public class MaximumSubarray {
    public static int kadanesAlgorithm(int arr[]){
        //better for the 2 vars to initiate with arr[0]
        int currentSum=arr[0];//0 cant for-ve also not math.intger_value
        int maxSum=arr[0];
        for(int i=1;i<arr.length;i++){//check with next element of array
            currentSum=Math.max(arr[i],currentSum+arr[i]);//save the better one
            maxSum=Math.max(currentSum,maxSum);
        }
        return maxSum;

    }
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("maxsum of subarray of the array is :"+(kadanesAlgorithm(arr)));
    }
    
}
