//extended version of maxsubarray
//display the subarray
//use of start,end but not two pointer 
//time-o(n),s-o(1)
public class KadensAlgorithm{
    public static void maximumsubArrayExt(int arr[]){
        //to store currentsum
        int currentsum=arr[0];
        //to store max of currentsum
        int maxsum=arr[0];
        //starting of index of subarray
        int start=0;
        //end of subarray
        int end=0;
        //iterate from next element of array
        for(int i=1;i<arr.length;i++){
            //update currentsum with better from arr[i] or arr[i]+currentsum
            //check if current element>sumof current element and currentsum
            if(arr[i]>arr[i]+currentsum){
                //restart
                currentsum=arr[i];
                //4
                start=i;

            }
            else{
                //neither continue with prev subarray
                currentsum=currentsum+arr[i];
            }
            //for end index of subarray
            //for maxsum
            if(currentsum>maxsum){
                maxsum=currentsum;
                //6
                end=i;
            }
        }
        System.out.println("maximum subarray");
            for(int i=start;i<=end;i++){
                System.out.print(arr[i]+" ");
                
            }
                            System.out.println();
                            System.out.println("max sum: "+maxsum);

        }
        public static void main(String[] args) {
            int arr[]={-2,1,-3,4,-1,2,1,-5,4};
            maximumsubArrayExt(arr);
        }
            
    }
