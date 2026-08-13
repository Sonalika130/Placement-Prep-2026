//row elements will be converted to mcolumn elements
//print arr[i][j]
//also iteration will be altered
//we are not chnaging i and j its just were visiting column first
//and column first traversal gives us the transpose
//row first traversal gives us the original array
import java.util.*;
public class TransposePrinting {
    public static void transpose(int arr[][]){
        //pouter loop tells u what u visit first
        //Choose a column first, then walk through the rows of that column.
        for(int j=0;j<arr[0].length;j++){//for columns
            for(int i=0;i<arr.length;i++){//for rows
                //as in og array col-first traversal results in 1,0,0,0,2,0 so col is set fixed
                System.out.print(arr[i][j]+" ");//printing the viceversa elements
            }
            System.out.println();
            
        }
        //return arr;
    }
    public static void main(String[] args) {
        int arr[][]={
            {1,2},{3,4},{5,6}
        };
        transpose(arr);
    }
    
}
