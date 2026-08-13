//row remains fixed we just need to col values of that row
import java.util.*;
public class RowWiseTraversal {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int arr[][]=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        //find 2nd row elements
        for(int j=0;j<cols;j++){
            //2nd row-in java index=1
            System.out.print(arr[1][j]+" ");
        }
        System.out.println();
        //for 3rd row eleemnts
        for(int j=0;j<cols;j++){
            System.out.print(arr[2][j]+" ");
        }System.out.println();
        //for 1st row elements
        for(int j=0;j<cols;j++){
            System.out.print(arr[0][j]+" ");
        }
    }
    
}
