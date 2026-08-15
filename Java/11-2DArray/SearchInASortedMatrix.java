//search an element when elemnts are sorted rowise
//also elemnts are sorted column wise
//so better idea is to search from top right most elemnt
//if current element>targ skip the col n move left 
//if current<targ then skip row move down
//if equal then found
//two pointer but significantly staircase search or top right search
//t-O(m+n)(m and n),for(nXn)-o(n),s-o(1)
public class SearchInASortedMatrix {
    public static boolean searchInSorted(int arr[][],int target){
        //for top-right most element
        int row=0;
        int col=arr[0].length-1;
        //conditional check
        //while going left(colwise),if it  reaches-1 then arroutof bound
        //also wile going down(rowwise) if it goes arr.length then arroutofbound
        while(row<arr.length && col>=0){
            //if top-right most el =target
            if(arr[row][col]==target){
                return true;
            }
            //neither check if its greater them move towards left
            else if(arr[row][col]>target){
                col--;

            }
            //arr[row][col]<target move toeards down n down
            else{
                row++;
            }
        }
        return false;//if row reached or col reached(arr.length)
    }
    public static void main(String[] args){
        int arr[][]={
            {1,2,3},{4,5,6},{7,8,9}
        };
        int target=0;
        System.out.println("given number found in array:"+searchInSorted(arr,target));
    }
    
}
