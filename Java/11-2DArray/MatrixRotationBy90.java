//matrix rotated by 90 degree clockwise
//1st transpose then vertical reflection

public class MatrixRotationBy90{
    public static int [][] rotation(int arr[][]){
        int trans[][]=new int[arr[0].length][arr.length];
        int rotated[][]=new int[trans.length][trans[0].length];
        //for transposing
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                trans[j][i]=arr[i][j];//rows and cols altered

            }
        }
        //for storing verical reflection of transpose matrix
        for(int i=0;i<trans.length;i++){
            for(int j=0;j<trans[i].length;j++){
                //as row remains same but column altered so for 4X4-0->3 1->2
                rotated[i][j]=trans[i][trans[0].length-1-j];
            }
        }
        return rotated;
    }
    public static void main(String[] args) {
        int arr[][]={
            {1,2,3},{4,5,6},{7,8,9}
        };
        //for printing 2d cant be accessed w arrays.tostring so
        int sol[][]=rotation(arr);
        for(int i=0;i<sol.length;i++){
            for(int j=0;j<sol[i].length;j++){
                System.out.print(sol[i][j]+" ");
            }
            System.out.println();
        }
        }

}