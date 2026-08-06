class RightTriangleNos{
    public static void main(String[] args){
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(n-j+1+ " ");//4321 432
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");//1 12 123 1234
            }
            System.out.println();
        }
    }
}