//sum of main diagonal and secondary diagonal of 2d
//for odd size square matrix we gotta skip middle like 5 for secondary unlike even mat like 4X4
public class DiagonalSum{
    public static int diagonalSum(int arr[][]){
        int sum=0;//global var as sum is same everywhere
        //main diagonal
        //square mat so i
        for(int i=0;i<arr.length;i++){
            //main diag sum
            sum+=arr[i][i];

        }
        //secondary diagonal
        //square so i or j,arr.length or arr[0].length
        for(int i=0;i<arr.length;i++){
            //in odd matrix size 3X3,5X5 we cant add the same middle no twice in main n secondary
            //so we gotta skip that is when we reach half of matrix
            //except middle el in secondary all els will added 
            if(i!=arr.length/2)//we skip 1st row n 1st col that is middle el in 2ndary mat as its alr added in 1st unlikke evn 
            sum+=arr[i][arr.length-1-i];//col-2,1,0
        }
        return sum;



    }
    public static void main(String args[]){
        int arr[][]={
            {1,2,3},{4,5,6},{7,8,9}
        };
        System.out.println("diagonal sum of matrix is:"+diagonalSum(arr));
    }

}