//an array with many consecutive sequence like 1,2,3,4 or 50,51,52 
//need to return the longest ones's length
//use of hashset and set.contains()
//just like kadens,count,maxcount(length)
//s-O(n),t-O(n)avg
import java.util.*;//import hashset
class LongestConsecutiveSequence {
    public static int longestConsecutiveSequence(int arr[]){
        int maxCount=0;
        //hashset
        HashSet<Integer> set=new HashSet<>();
        //for(int i=0;i<arr.length;i++){set.add(arr[i])}
        //enhanced for loop to add elements into hashset
        //no need of i just to put number in indices
        for(int num:arr){
            set.add(num);
        }
        

        //start of a sequence
        for(int num:set){
            //initiate so index of 1st is 1
                //also count must reset for every sequence
                int  count=1;

            if(!set.contains(num-1)){
                //using num algo good,
                //but here its representing starting element
                int current=num;//extending current
                
                //for iterating the rest numbers in array to get consecutive numbers
                //while for iteration++
                //if contains next number of current then keep increasing
                while(set.contains(current+1)){
                    current++;
                    //length starting from 1
                    count++;
                }
                
            }
            //check maximum length/count of sequence present in array if its multiple
                 maxCount=Math.max(maxCount,count);

        }
                         //return length of longest consecutive sequenc
                          return maxCount;

    }
    public static void main(String[] args){
        //only one consecutive sequence
        int arr1[]={1,400,2,3,98,56,4,9};
        //more than one
        int arr2[]={1,400,2,50,51,52,78};
        System.out.println("length of the longest consecutive sequence:"+longestConsecutiveSequence(arr1));
        System.out.println("length of the longest consecutive sequence:"+longestConsecutiveSequence(arr2));
    }

    
}
