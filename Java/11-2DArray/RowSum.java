//sum of each row
//arr.length->size of rows
//arr[i].length->col size
import java.util.*;
public class RowSum {
    public static void rowSum(int arr[][]){
        for(int i=0;i<arr.length;i++){
            int sum=0;//sum reinitialised after every row
            //arr[i].length-number of elements in row i
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
            System.out.println("sum of "+(i+1)+ "row is "+sum);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        rowSum(arr);
    }
    
}
