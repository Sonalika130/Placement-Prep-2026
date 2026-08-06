class Pyramid{
    public static void main(String[] args){
        int n=4;//no of rows
        //outerloop,row no
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");

            }
            //inner loop for printing stars
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}