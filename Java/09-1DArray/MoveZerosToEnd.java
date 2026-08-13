//move all non zero as it is in a order then the zero
//two pointer-i,j moving in same direction
//i for tracking,j for swapping
//0 1 0 3 12->1 3 12 0 0
//O(n)
//order of non zero remains same
public class MoveZerosToEnd {
    public static void moveZerosToEnd(int arr[]){
        int j=0;//for swapping
        int temp=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                 temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;

            }
        }
        System.out.println("after moving zeros to end");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
        public static void main(String[] args){
            int arr[]={0,1,0,3,12};
            moveZerosToEnd(arr);

        
    }
    
}
