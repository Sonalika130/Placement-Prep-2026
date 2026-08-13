//find single number when other are presnet twice,only one single number
//can be done by finding  hashmap and return the numbers whose coun t is 1 but,
//better approach-XOR^ -> O(n) time,O(1)
//property of xor-(a^a->0 , a^0-a)
//xor can be rearranged like if the given array is unsorted
//start with 0,as with arrr[0]-no o0 to end up with single number
// can be unsorted or sorted
public class FindSingleNumber {
    public static int findSingle(int arr[]){
        int result=0;//to do xor with next
        for(int i=0;i<arr.length;i++){
            result=result^arr[i];//xor operation
            //does sort the elements so that twice occuring elements cancelled to 0
        }
        return result;

    }
    public static void main(String[] args){
        int arr[]={1,2,3,1,4,2,3};
        System.out.println("single number is : "+findSingle(arr));
    }}
  //can be done using hashmap-
  //for(num:map){
  //if(map.get(num)==0)
  //return num;
  //}

    

