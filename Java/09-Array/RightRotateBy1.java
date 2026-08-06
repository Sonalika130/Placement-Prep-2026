//shifting right-from right
//O(n)y 
//last moves to first rest right shift by 1
 public class RightRotateBy1 {
    public static void rightRotate(int arr[]){
        int temp=arr[arr.length-1];
        //from last as no value loses
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        int arr[]={2,3,46,7,999};
        rightRotate(arr);
    }
    
}
