//optimal solution
//t-o(m*n),s-o(1)-use of no array,hashsets,hashamps
//were storing the variables or keep changing things in the array itself,inplace
//initally we check if the 1st row and col have zero or not
//if not we use them for storage house for zeros so they can store zeros and assign them zero
//once from 2nd row zero found iterate to keep all values in its row and column to zero

//Anywhere there is an original zero → zero its entire row and column.

//But first, use the first row and first column as storage to remember which rows/columns need zeroing.

//Then process the inside of the matrix using those markers.

//Finally, if the first row/column originally contained zero, zero them too.
import java.util.*;
public class SetMatrixZeroOptimal {
    //storing the updated matrix in arraylist
    public static int[][] setMatZero(int arr[][]){
        boolean firstrowzero=false;//set initally no zero in row
        boolean firstcolzero=false;//initially no zero in columns
        //traversing through row,each els in row
        for(int j=0;j<arr[0].length;j++){
            if (arr[0][j]==0){
                firstrowzero=true;//first row have zero

            }

        }
        //traversing through cols
        for(int i=0;i<arr.length;i++){
            if(arr[i][0]==0){
                firstcolzero=true;//1st col hv zero
            }
        }
        //traversing from row 1 and col 1 to all elements
        //i.,e.except first row and col 
        //as we use them to store zero instead of hashset so we cant modify  them
        for(int i=1;i<arr.length;i++){
            for(int j=1;j<arr[i].length;j++){
                if(arr[i][j]==0){//if elemement is zero
                    arr[0][j]=0;//then its top/first col is set zero
                    arr[i][0]=0;//its row value in 0 th is also set zero so we can track letter
                }
            }
        }
        //now traversing if any of the elemnts index contains 0 then keep the entirenindex zero 
        for(int i=1;i<arr.length;i++){
            for(int j=1;j<arr[i].length;j++){
                if(arr[0][j]==0||arr[i][0]==0){//if 1st row/col contains
                    arr[i][j]=0;//make the entire elemnt in that row or col zero
                }
            }
        }
        //first row → stores which COLUMNS need zero    
        //first col → stores which ROWS need zero
        //now for 1st  row if zeros are there initially
        //we cant use them as store anymore
        //we fill entire row w zeros
        if(firstrowzero){
        for(int j=0;j<arr[0].length;j++){
            arr[0][j]=0;
        }
    }
    //similarly for col like row
    if(firstcolzero){
    for(int i=0;i<arr.length;i++){
        arr[i][0]=0;
    }
}
return arr;

    
}
public static void main(String[] args) {
    int arr[][]={
        {1,2,3},{1,0,5},{6,7,0}
    };
    int arr1[][]={
        {1,0,7},{1,4,0},{50,7,8}
    };
    int sol1[][]=setMatZero(arr);
    int sol2[][]=setMatZero(arr1);
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
    for(int i=0;i<arr1.length;i++){
        for(int j=0;j<arr1[i].length;j++){
            System.out.print(arr1[i][j]+" ");
        }
        System.out.println();
    }

}
}