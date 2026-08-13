//hash set used for storing distinct also checks itself if present
//not brute force sol,(well need 2 arrays)brute sol-checking current element with every next element-O(n^2))
//complexity-O(n) average.as we visit every element
//space-o(n)
//not sort and need to remember what weve seen
//import java.util.HashSet;//importing hashset
import java.util.*;//it also contains hashset
public class ContainDuplicates{
    public static boolean containDuplicate(int arr[]){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){//if contain element
                return true;
            }else
                set.add(arr[i]);//add element if not

        }
        return false;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7};
        boolean bool=containDuplicate(arr);
        System.out.println("contain duplicate:"+bool);
    }
}