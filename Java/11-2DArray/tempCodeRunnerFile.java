//row elements will be converted to mcolumn elements
//print arr[j][i]
//also iteration will be altered
import java.util.*;
public class TransposePrinting {
    public static void transpose(int arr[][]){
        for(int i=0;i<arr[0].length;i++){//for columns
            for(int j=0;j<arr.length;j++){//for rows
                System.out.print(arr[j][i]+" ");//printing the viceversa elements
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
