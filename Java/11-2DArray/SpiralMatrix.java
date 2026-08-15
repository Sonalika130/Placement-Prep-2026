// 4 pointer used to solve
//or 4 boundary values-left,right,top,bottom
//top=0,bottom=2,left=0,right=2
//first l->r,t++,r->b,r--,bottom r->l,b--,bottom ->left,left++
//until l>r,b>t
//with every movement one of the row or col shrinks
//stop when top > bottom or left > right comes at one same place
public class SpiralMatrix {
    public static void spiralMatrix(int arr[][]){
        int top=0;//indicates row at top
        int bottom=arr.length-1;//row at bottom of every matrix
        int left=0;//leftmost column
        int right=arr[0].length-1;//rightmost col
        //a condition is used that rule the entire matrix movement,while is used
        //keep checking until left or top bigger than right n bottom repsectively
        //which means theres no col or row left to visit
        while(left<=right && top<=bottom){//if one of this is false then false
            //1st-left to right at top row
            for(int i=left;i<=right;i++){
                System.out.print(arr[top][i]+" ");//00 to 01 to 02
            }
            top++;//0->1 next row
            //now on row no1 move from top to bottom on right col
            for(int i=top;i<=bottom;i++){
                System.out.print(arr[i][right]+" ");
            }
            right--;//move inward now col-1 is rightmost
            //now on bottom move right to left
            for(int j=right;j>=left;j--){
                System.out.print(arr[bottom][j]+" ");
            }
            bottom--;//move inward b=1 now on left move bottom to top
            for(int j=bottom;j>=top;j--){
                System.out.print(arr[j][left]+" ");
            }
            left++;//move next to right and l=1 and stop when left right or t or bottom come at one place


        }
        }
        public static void main(String args[]){
            int arr[][]={
                {1,2,3},{4,5,6},{7,8,9}
            };
            spiralMatrix(arr);
        
    

    
}
}
