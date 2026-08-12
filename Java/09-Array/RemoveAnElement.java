//in place-that is modification in same array,no extra 
//remove elemnt if its same as target value and store in another one
//t-o(n),s-o(1)
public class RemoveAnElement {
    public static int remove(int arr[],int value){
        int index=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=value){
                arr[index]=arr[i];
                index++;

            }

        }
        return index;

    }
    public static void main(String args[]){
        int arr[]={3,2,2,3};
        int value=3;
        System.out.println("removed element:"+remove(arr,value));
    }
    
}
