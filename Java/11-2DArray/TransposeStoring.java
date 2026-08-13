//storing the transposed value in transpose matrix
//i.e arr[i][j]=trans[j][i]
//also size of matrices are altered
import java.util.*;
public class TransposeStoring{
    public static void transpose(int arr[][]){
        //transpose that is size of row and column altered
        int transpose[][]=new int[arr[0].length][arr.length];
        //scanning elements of og array
        for(int i=0;i<arr.length;i++){//rows
            for(int j=0;j<arr[i].length;j++){//columns
                //storing the array value in transpose
                transpose[j][i]=arr[i][j];

            }
            

    }
    System.out.println("transposed matrix:");
    //use transpose dimension
    for(int i=0;i<arr[0].length;i++){
        for(int j=0;j<arr.length;j++){
            System.out.print(transpose[i][j]+" ");
        }
        System.out.println();
    }
}
public static void main(String args[]){
    int arr[][]={
        {1,2,3},{4,5,6}
    };
    transpose(arr);

}
}