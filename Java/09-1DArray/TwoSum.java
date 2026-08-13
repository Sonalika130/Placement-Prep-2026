//using hashmap-optimal
//what we need and if weve seen it
//returns in array the index of 2 nos whose sum=target
//brute force-2 nested for lool-O(n^2)
//use of map.containsKey() in hashamp unlike hashset
//complexity-O(n)avg(get(),put()etc in loop),s-o(n)(we storing n entities in hasmap)
import java.util.*;//contain collective class hashmap
public class TwoSum{
    //returns in array,int[]
    public static int[] twoSum(int arr[],int target){
        //key,index
        HashMap<Integer,Integer> map=new HashMap<>();
        //traversing through the array
        //int needed=0; ok but the below is better
        for(int i=0;i<arr.length;i++){
            //variables scope-as much close to where its needed
            int needed=target-arr[i];
            //if result already there in map
            if(map.containsKey(needed))
                //create an array
                //return index of result and current element in hashmap as an array
                return new int[]{map.get(needed),i};            
            else
            map.put(arr[i],i);
            
    }
    //return an empty array as per our return type int[] ,
    //if no sum pair is there and loop finishes
    return new int[]{};
}

    
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int target=7;
        System.out.println("sum of two numbers whose sum is "+target+ " present at "+(Arrays.toString(twoSum(arr,target))));
    }
}