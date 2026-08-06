//1 22 333 444
class NumberPyramid{
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }//no of cols =row no
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}