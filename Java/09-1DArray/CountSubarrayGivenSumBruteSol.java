//Bruteforce solution
//use of two nested for loops
//keep calculating sum for each element until it reaches target and count for that subarray
//t-o(n^2),s-o(1)

public class CountSubarrayGivenSumBruteSol {
    public static int countSubArrayGivensum(int arr[],int value){
        int count=0;//no of subarray containing given sum 
        for(int i=0;i<arr.length;i++){//scanning each element of array
            //initialise sum and its done here as it will initialise for every subarray
            int sum=0;
            for(int j=i;j<arr.length;j++){
                //add all elements after the currentnumber
                sum+=arr[j];
                    //inside for loop because whenever we find a subarray we count
            
            if(sum==value){
                count++;
            }
        }
        }
        return count;

    }
    public static void main(String[] args){
        int arr[]={1,2,1,2};
        //for 1,1+2->1,for 2,2+1->3,for 1,1+2->3,for 2 no
        int givenSum=3;
        System.out.println("count of subarrays with given sum: "+countSubArrayGivensum(arr,givenSum));
    }
    
}
