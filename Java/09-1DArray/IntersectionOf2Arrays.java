//intersection-common in 2 arrays
//hashset
//t-O(n+m)avg,s-o(n+m)
import java.util.*;
public class IntersectionOf2Arrays {
    //for returning hashset
    //public static HashSet<Integer> intersection(int arr[],int a[]){
    //for returning in integer array form
    public static int[] intersection(int arr[],int a[]){
        HashSet<Integer> set=new HashSet<>();
        //another HashSet to keep common
        HashSet<Integer> sett=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        for(int i=0;i<a.length;i++){
            if (set.contains(a[i])){
                sett.add(a[i]);
            }
        }
        //return sett;in the form of set
        //int he form of array
        int array[]=new int[sett.size()];//size of sett->common elements in both
        int i=0;//for each element in array
        //for accesssing every element in set and storing in NUM variable to  be accessed by array
        for(int num:sett){
            array[i]=num;
            i++;
        }
        return array;
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4};
        int a[]={7,8,9,2,2,5,3};
        //the below statement print garbage value,shows internal reference of arary
        //System.out.println("intersection of two arrays"+intersection(arr,a));
        int sol[]=intersection(arr,a);
        //.tostring to convert into a string as an array cant be read like that
        //it converts into a readable string showing actual content of the array
        System.out.print("intersection of two arrays is"+Arrays.toString(sol));       
    }
    
}
