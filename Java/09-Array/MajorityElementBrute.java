//element present >n/2 times
//brute force solution
//use of hashmap-entryset,entry.getKey(),entry.getValues
//t-o(n),s-o(n)
import java.util.*;
public class MajorityElementBrute{
    public static int majorityElement(int arr[]){
        //to store number and their counts
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);

        }
        //to check both key and value and return key only
        //for accessing both key and value at same time
        //for(Map.Entry<Integer,Integer> entry: map.entrySet())->entry,count anything
        for(Map.Entry<Integer,Integer> pairs:map.entrySet()){
            if(pairs.getValue()>arr.length/2)//count>n2
                return pairs.getKey();//key of the pair whose count is max

        }
        return 0;
    }
    public static void main(String[] args){
        int arr[]={2,2,2,1,1,2,1};
        System.out.println("majority lement: "+majorityElement(arr));

    }
}