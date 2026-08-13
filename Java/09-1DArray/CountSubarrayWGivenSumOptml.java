//optimal sol
//t-O(n),s-O(n)
//use of hashmap,containKey(),map.get(),map.getOrDefault()
//prefix sum,early prefix sum(sum-k )to find the numbers in between them whose sum=array
//how many times prefix sum already happen-count
//return that count
import java.util.*;//for hashmap
public class CountSubarrayWGivenSumOptml {
    public static int countSubArray(int arr[],int k){
        //storing prefix sum and its frequency
        HashMap<Integer,Integer> map=new HashMap<>();
        //initialise sum=0 and happened once like before anyprefix
        map.put(0,1);
        int count=0;
        int sum=0;
        for(int num:arr){//accessing array elements
            sum+=num;//current prefix like after 2 sum is 2
            //find earlier prefix 
            //here subarray also found that is from earlier prefix to current prefix
            if(map.containsKey(sum-k)){
                //increment how many time that subarray is occuring
                //store sum but check count value from that
                count+=map.get(sum-k);
            }
            //put the sum and frequncy
            map.put(sum,map.getOrDefault(sum,0)+1);



        }
        return count;


    }
    public static void main(String args[]){
        int arr[]={2,1,2,1};
        int target=3;
        System.out.println("count of subarrays with given sum:"+countSubArray(arr,target));
    }
    
}
