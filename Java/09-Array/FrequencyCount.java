//collection class
// hashmap-key and its value
//get()->get the value
// put()->store/update value
// get value,or if key not exist use a default key
//if a key is not present in a hasmap,
//map.get(key) returns null
//getOrDefault(key,0)gives 0 instead
//map={2,3},arr[i]=2,map.get(2)-3
//get,put,hashmap and getordefulalt is all o(1)avg 
//complexity O(n)avg,space-o(n)
//hashmap -{} unlike hashset-[],cause of tostring 
import java.util.*;
public class FrequencyCount {
    public static void frequencyCount(int arr[]){
        //initialisation of hashmap object
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            //map.put(arr[i],map.getOrDefault(map.get(arr[i]),0)+1);AS,
            //here map.get is not a key,we wamt to ask about key a[i],instead
            //below arr[i]-key,getordefault-value/count
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        //java itself provides tostring itself so no need of using tostring externally
        System.out.println(map);
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,5,2,7,4};
        frequencyCount(arr);

    }
    
}
