public class CountEvenOdd {
    public static void countEvenOdd(int arr[]){
        if(arr.length==0)//edge case
            return ;
        int countEven=0;
        int countOdd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0)
                countEven++;
            else
            countOdd++;
        }
        System.out.println("even :"+countEven+" odd count:"+countOdd);

    }
    public static void main(String[] args){
        //int arr[]={};nothing in output
        int arr[]={1,23,44,2,1};
        countEvenOdd(arr);
    } 
    
}
