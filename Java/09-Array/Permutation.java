//for used when traversing all elements and starting and ending elements known
//while moves on the basis of condition,when index are not known like upto what value
//here while is used
//Find the next lexicographically greater permutation by making the smallest possible increase at the rightmost possible position.
//find pivot from right side of array(1st smallest possible) while right side right should be in non increasinf order
//find smallest possible large number after pivot from right side
//swap the two numbers
//reverse the suffix-after pivot
//use of i,j
//use of two pointer for reverse
//t-o(n)-pivot(o(n))+no to swap(o(n))+reverse(o(n))
//space-o(1)as only variables no extra array list or maps
//we don't reverse it to access the number for permutation. We reverse it because there is no pivot, so the next permutation is the smallest possible arrangement.
//the above one for if 3,2,1-then 1,2,3 smallest permutation just reverse it
import java.util.*;
public class Permutation {
    //return array thats next permutation
    public static int[] nextPermutation(int arr[]){
        //find pivot from right,1st smallest element not most
        int i=arr.length-2;//2nd element from last
        //if last 2nd element bigger than last 1st then keep moving until last 2nd becomes smaller than 1st
        while(i>=0 && arr[i]>=arr[i+1]){
            i--;
        }//if pivot exists traverse through all elements after it,find smallest bigger element
        if(i>=0){//pivot exits
        int j=arr.length-1;//from element after pivot to last element of array
        //while(j>=i+1 && arr[j],=arr[i]){//ok but no need
        //keep findinf the smallest big no after pivot
        //as after pivot everything in decreasing order
        //rightmost one is the smallest gretaer number
        while(arr[j]<=arr[i]){
            j--;
        }
    
        //swap the numbers
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
        //now reverse the suffix,after pivot elemnt
        int left=i+1;//element after pivot
        int right=arr.length-1;
        while(left<right){
            int t=arr[left];
            arr[left]=arr[right];
            arr[right]=t;
            left++;
            right--;
        }  
        return arr;      
            


        

    }
    public static void main(String[]args){
        int arr[]={1,2,5,4,3};
        System.out.println("next permutation");
        System.out.println("next permutation:"+Arrays.toString(nextPermutation(arr)));

    }
}

