//secondary diagonal->i+j=arr.length
//column moves 2 to 1 to 0 
//if 3x3 matrix-then [0][2],[1][1],[2][0]-sum=2/length-1
//but here optimised one is used that is for j arr.legth-1-i
public class SecondaryDiagonal {
    public static int secondaryDiagonal(int arr[][]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            //for(int j=0;j<arr[i].length;j++){
                //sum of elements in this position =length-1
                //if(i+j==arr.length-1)checking all elements
                //{
                    //as for 3X3-0,2 1,1 2,0 
                    sum+=arr[i][arr.length-1-i];
                //}
            //}
        }
        return sum;
    }
    public static void main(String args[]){
        int arr[][]={
            {1,2,3},{4,5,6},{7,8,9}
        };
        System.out.println("sum of secondary diagonal elements:"+secondaryDiagonal(arr));
    }
    
}
