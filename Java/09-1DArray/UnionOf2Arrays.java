//hashset itself checks duplicates before storing the next number
//{1,2,3},{2,3,4}-{1,2,3,4}
//no use of contains as it itself checks before storing unlike in that contain duplicate question
import java.util.*;//hashset
public class UnionOf2Arrays{
    //HashSet<Integer>- java class/ds
    //its return type or objects is class no int
    public static HashSet<Integer> unionOfTwoArrays(int arr[],int a[]){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
             set.add(arr[i]);
        }
        for(int i=0;i<a.length;i++){
            //if(!set.contains(a[i])) ->not needed as hashset aiself ignores duplicates 
            set.add(a[i]);

        }
        return set;
        }
        public static void main(String[] args) {
            int arr[]={1,2,3};
            int a[]={4,5,2,1};
            System.out.println("union of 2 arrays"+unionOfTwoArrays(arr,a));
        }
        
    }
