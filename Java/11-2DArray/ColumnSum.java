//sum of elements in column
//column will be fixed
//arr->row->arr.length()-number of rows
//arr[i].length-elemnts in each row-i.e.each column elements
//herenin colsum,arr[0].length because column will remain fixed we just need number of columns not traversing through each column
public class ColumnSum {
    public static void columnSum(int arr[][]){
        
        for(int j=0;j<arr[0].length;j++){
            int sum=0;//sum reinitialised after every new column
            for(int i=0;i<arr.length;i++){
                sum+=arr[i][j];//always rows and columns
            }
            System.out.println(j+1 + "column value is"+sum);
        }
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6}};
        columnSum(arr);
    }
    
}
