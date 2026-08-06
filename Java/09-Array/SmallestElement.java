//O(n)
public class SmallestElement {
    public static int findSmallest(int arr[]){
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min)
                min=arr[i];
        }
        return min;
    }
    public static void main(String[] args){
        int [] arr={-23,-13,-7,-99};
        //int [] arr={1,34,56,7,0,67};smallest-0
        System.out.println("smallest element is "+findSmallest(arr));

    }
    
}
