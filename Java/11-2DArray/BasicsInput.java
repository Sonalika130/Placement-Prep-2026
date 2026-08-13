//like matrix-roes and columns
//java indexing starts at 0
import java.util.*;
public class BasicsInput {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int arr[][]=new int[rows][cols];
        //int arr[][]=new int[3][4];12 elements
        //taking input
        //outer loop controls rows
        for(int i=0;i<rows;i++){
            //inner loop controls all columns in each row
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();

            }

        }
        //printing the array-arr[0][0]-1
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    
}
