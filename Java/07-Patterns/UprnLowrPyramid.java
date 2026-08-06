//diamond
class UprnLowrPyramid{
    public static void main(String[] args){
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }//for 2 same line diamond

        //for(int i=1;i<=4;i++){
        //for removing the same line
        for(int i=2;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*(n-i)+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}