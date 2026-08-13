//O(n),O(1)
//only 1 and 0 
//count consecutive,reset to count =0 if encountered with 0,then again
//calculate max count
public class CountConsecutive1s {
    public static int maxConsecutiveOnes(int arr[]){
        int count=0;
        int maxCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }
            else{ 
                count=0;

            }
            maxCount=Math.max(count,maxCount);

        }
        return maxCount;
    }
    public static void main(String[] args) {
        int arr[]={1,1,0,1,1,1,0,1};
        System.out.println("maximum consecutive ones:"+maxConsecutiveOnes(arr));

    }
    
}
