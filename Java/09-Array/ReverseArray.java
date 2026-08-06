//swap 1st n last
//then 2nd n 2nd last
//stop in middle
//move left++ n right--
//O(n)
//TWO POINTER-USE OF 2 INDEX(LEFT,RIGHT),COMPARING ELEMENTS FROM BOTH END
public class ReverseArray {
    public static void reverseArray(int arr[]){
        int temp=0;
        int left=0;//used as index of first element
        int right=arr.length-1;//if size=5,then 4 as per zeroth indexing rule of java
            //use of two variables so while
            while(left<right){//as middle cant be replaced with itself if its of odd indeices
            temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
            }
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};

        reverseArray(arr);
    }
    
}
