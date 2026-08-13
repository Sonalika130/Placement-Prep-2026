//diagonal elements=i=j 
//but i=i,optimised ver as it visits only 3 cells and give sum unlike 2 for loops
//visiting 9 and selecting 3
public class MainDiagonalSum {
    public static int diagonalSum(int arr[][]){
        int sum=0;//main sum
        for(int i=0;i<arr.length;i++){//row numbers
            //for(int j=0;j<arr[i].length;j++){
            //as no need of two loops and i=j so 
                //if(i==j){
                //if i==j,arr[1][1],arr[0][0]-diagonal elements
                    sum+=arr[i][i];
                
            }
        
        return sum;
    }
    public static void main(String args[]){
        int arr1[][]={
            {1,2,3},{4,5,6},{7,8,9}
        };
        System.out.println("sum of diagonal elemnts:"+diagonalSum(arr1));
    }
    
}
