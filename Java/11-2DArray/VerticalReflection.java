//aka mirror image of matrix/array
// left to right
//1st col changed with 3rd middle same ,for 4X4 1st w last and 2nd w 3rd
//values remainsame in row,just values changed in column
//col values will be changed with total number cols-1-current col no
import java.util.*;
public class VerticalReflection {
    public static int[][] columnReflection(int arr[][]){
        for(int i=0;i<arr.length;i++){//scanning rows
            for(int j=0;j<arr[i].length/2;j++){//scanning half columns
                int temp=arr[i][j];//swap
                arr[i][j]=arr[i][arr[i].length-1-j];//
                arr[i][arr[i].length-j-1]=temp;
            }
        }
        return arr;
    }
    public static void main(String args[]){
        int arr[][]={{1,2,3},{4,5,6}};
        int arr1[][]=columnReflection(arr);
        for(int i=0;i<arr1.length;i++){
            System.out.println(Arrays.toString((arr1[i])));
        }

    }
    
}
