//stars on boundary and hollow inside
class HollowRectangle{
    public static void main(String[] args) {
        int rows=4;int cols=5;
        //2 loops-inner and outer
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=cols;j++){
            if(i==1 || i==rows ||j==1 ||j==cols)
                System.out.print("*");
            else
                System.out.print(" ");
                
            }System.out.println();
        }
    }
}