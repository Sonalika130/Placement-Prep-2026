public class ConcentricNOPattern {

    public static void main(String args[]){
        int n=4;//number on border
        int size=2*n-1;//size
        //indexing and traversing
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                //top
                int top=i;
                int left=j;
                int bottom=size-1-i;
                int right=size-1-j;
            //min distance from border or nearest border
            int min=Math.min(Math.min(top,bottom),Math.min(left,right));
                //print value of layer
              System.out.print((n-min)+" ");

            }System.out.println();
        }
    }
}
