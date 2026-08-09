//arranging an array with +ve -ve +ve -ve
//use of pos,neg variables ,stored in result array
//+ve-even +2,negative-odd+2 if i=1
//O(n)-t,O(n)-space
//use of index placement algo
//returns equal +ve and -ve side by side
public class RearrangeElementsBySign{
public static void rearrangeBySign(int arr[]){
    //a new array of sam elength to store arranged elements
    int result[]=new int[arr.length];
    //positive elements r at even position-+2
    int pos=0;
    //negative elemets at odd so +2 but from next index
    int neg=1;
    //traversing through the array
    for(int i=0;i<arr.length;i++){
        if(arr[i]>0)
            {
        result[pos]=arr[i];
                    pos+=2;

    }
    else{
        result[neg]=arr[i];
                neg+=2;

    }

}
    //new rearranged array
    for(int i=0;i<result.length;i++){
        System.out.print(result[i]+" ");
    }
    }
    public static void main(String[] args){
        int arr[]={1,3,-4,-5,3,-6};
        System.out.println("rearranged arary");
        rearrangeBySign(arr);
    }
}
