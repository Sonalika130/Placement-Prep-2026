//linear search in a mtrix
//t-O(m*n)
public class SearchinAmatrix {
    public static boolean searchinMatrix(int arr[][],int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(target==arr[i][j]){
                    return true;
                }
            }
        }
            return false;
        
    }
        public static void main(String args[]){
            int arr[][]={
                {1,2,3},{4,5,6}
            };
            int tar=0;
            System.out.println(+tar+" found in matrix "+ searchinMatrix(arr,tar));
        }
    }
    

