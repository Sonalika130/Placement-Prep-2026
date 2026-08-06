public class CheckArraySorted {
    public static boolean checkSorted(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            //throws error(arr.length)-as last index 4 compares with arr[5 ]which is incorect
            if(arr[i]>arr[i+1])
                return false;//early termination

    } 
    return true;//if 5,5,5,5 also return true

    
}
public static void main(String[] args) {
    int arr[]={1,2,3,4,6,7};
    System.out.println(checkSorted(arr));
}
}
