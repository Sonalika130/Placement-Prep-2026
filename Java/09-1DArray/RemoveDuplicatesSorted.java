//time complexity-O(n),space-o(1)
//array not sorted,duplicates are always next to eo
//no use of extra array
//sorted,adjacent duplicates
//using same array so j used,also unique part ends here
//next distinct element is gonna be stored in j+1 place,next place
public class RemoveDuplicatesSorted{
public static int removeDuplicates(int arr[]){
    if(arr.length==0)//edge case if its empty
        return 0;
    int j=0;//tracks and stores distinct element
    for(int i=1;i<arr.length;i++){//scans the element
        if(arr[i]!=arr[j]){
            j++;//store in the next index not in the same position
            arr[j]=arr[i];
        }}
        //displaying array 
        //after removing suppose 1,1,2,2,3-1,2,3and last indices remain same -2,3
        //so print upto changed indices
        for( int i=0;i<j+1;i++){//as j is initiated with zero so j+1
            System.out.print(arr[i]+ " ");

        }
        System.out.println();
        //number of distinct element
        return j+1;

    }
    public static void main(String[] args) {
        //array must be sorted so duplicates can be next to each other
        int arr[]={1,1,2,2,3,4,5,5,5};
        System.out.println("after removing duplicates,no of distinct element:"+removeDuplicates(arr));
    }

}



