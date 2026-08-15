//set 0 the entire column and row of it where 0 is spotted in og
//better sol not optimal
//use of 2 hashsets 
//ad and contains
//t-O(m*n),s-O(m+n)
//2 for loop -storing and checking and assigning
import java.util.*;//for set
public class SetMatrix0Better {
    public static int [][] setZero(int arr[][]){
        //hashsets for storing the numbers and later using if seen again
        HashSet<Integer> row=new HashSet<>();
        HashSet<Integer> col=new HashSet<>();
        for(int i=0;i<arr.length;i++){//for scanning rows
            for(int j=0;j<arr[i].length;j++){//for columns
            //if zero then add i,j index to set
                if(arr[i][j]==0){
                    row.add(i);//add row no
                    col.add(j);//add col no
                }
            }
        }
        //for loop for checking and assignng 0
        //the index the zero is its entire row and col will be zero
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                //entire row and col will be filled with zero if set contains
                if(row.contains(i) || col.contains(j)){
                    arr[i][j]=0;

                }
            }
        }
        return arr;
    }
        public static void main(String args[]){
            int arr[][]={
                {1,2,3},{4,0,5},{6,7,0}
            };
            int sol[][]=setZero(arr);
            for(int i=0;i<sol.length;i++){
                for(int j=0;j<arr[i].length;j++){
                    System.out.print(sol[i][j]+" ");
                }
                System.out.println();
            }

        }

    }

