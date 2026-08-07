//n*n+1/2
//O(n)
//0(1)
//n is length of and max is also 2 and it should end with 2 
//missing=sum of total number from 0 to n-sum of total given number
//array may or may not contain 0 and only one single element must be missing
public class MissingNumber{
    public static int missingNumber(int arr[]){
        if(arr.length==0)
            return 0;
        int n=arr.length;
        int expectedSum=(n*(n+1))/2;//sum of n numbers
        int actualSum=0;//sum of given numbers
        for(int i=0;i<arr.length;i++){
            actualSum+=arr[i];

        }
        return expectedSum-actualSum;


    }
    public static void main(String[] args) {
        int arr[]={1,2,0,4};
        System.out.println("missing element is:"+missingNumber(arr));
    }
    
}