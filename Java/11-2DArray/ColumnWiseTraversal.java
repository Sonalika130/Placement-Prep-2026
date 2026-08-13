//col wise traversal-col will remain fixed
//only row elements of that column will be printed
//arr[i][1]for 2nd col
import java.util.*;
public class ColumnWiseTraversal {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int arr[][]=new int[rows][cols];
        //for taking imput
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        //for 1st column-row values,col will be fixed-col=0
        for(int i=0;i<rows;i++){
            System.out.println(arr[i][0]);
        }
        //for 2nd col traversal
        for(int i=0;i<rows;i++){
            System.out.println(arr[i][1]);//2nd col is fixed,in java col=1
        }
    }
    
}
