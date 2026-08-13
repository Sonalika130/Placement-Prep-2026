//distinct 2nd largest
//o(n)
public class SecondLargest {
    public static int findSecondLargest(int arr[]){
        int largest=arr[0];
        //edge case
        int secondLargest=Integer.MIN_VALUE;//for -ve values
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }//duplicate-edge case
            //second largest also prevent duplicate(same largest and 2nd largest)
            //else cant be used with a condition like if and else if
            else if(arr[i]>secondLargest && arr[i]!=largest){//arr[i]>largest
                secondLargest=arr[i];
            
        }
    }
    return secondLargest;

    }

        public static void main(String[] args){
            int []arr={5,2,9,71,1};
            int []array={67,5,67,8,9,4};
            
            System.out.println("2nd largest of 1st array"+findSecondLargest(arr));
            System.out.println("2nd largest of 2nd array"+findSecondLargest(array));
            //edge case
            int arrr[]={5,5,5,5};
            int ans=findSecondLargest(arrr);
            if(ans==Integer.MIN_VALUE)
                System.out.println("not found");//searching for distinct
            else
                System.out.println(ans);

        
    }
    
}
