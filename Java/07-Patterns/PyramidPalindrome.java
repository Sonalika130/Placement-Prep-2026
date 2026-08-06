class PyramidPalindrome{
    public static void main(String[] args){
        int n=4;
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
//inner loop for characters increasing,4
            for(int j=1;j<=i;j++){
                System.out.print((char)('A'+j-1));
            }
//inner loop for backward to a
            for(int j=i-1;j>=1;j--){
                System.out.print((char)('A'+j-1));
            }
            System.out.println();
        }
    }
}