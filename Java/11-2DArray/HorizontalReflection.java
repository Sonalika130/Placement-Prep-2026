//row relction
//i.e.,1st row is alterd with 3rd,2nd remains same in 3X3
//in 4X4 1st is with last and 2nd with 3rd
//so we will visit half rows and swapped with total (rows-1-current row)
//here in this rows will be altered but columns will be same
//values in cols will remain same only values row will be changed i.e.,altered
import java.util.*;
public class HorizontalReflection {
    public static int[][] horizontalReflection(int arr[][]){
        for(int i=0;i<arr.length/2;i++){//scan half rows only
            for(int j=0;j<arr[i].length;j++){
                //swaping the values in column as column is fixed
                // //0 for 3,1 for 2 rows-so with arr.length-1-current row
                int temp=arr[arr.length-1-i][j];//swap happening in same column
                arr[arr.length-1-i][j]=arr[i][j];
                arr[i][j]=temp;
            }

        }
        return arr;

    }
    public static void main(String[] args){
        int arr[][]={
            {1,2,3},{4,5,6},{7,8,9}
        };
       int arr1[][]= horizontalReflection(arr);
       //as its an array of arrays so better to display each row 
       for(int i=0;i<arr1.length;i++){
       System.out.println(Arrays.toString(arr1[i]));

    }
}
    
}
