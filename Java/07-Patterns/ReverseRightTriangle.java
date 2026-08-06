class ReverseRightTriangle{
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){//pattern-total left=total-lost
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }
}