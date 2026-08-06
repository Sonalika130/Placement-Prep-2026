//1 21 321 4321 54321
class ReverseNum2Triangle{
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++){
            //restart with each loop
            int num=i;
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num--;//revrese it

            }
            System.out.println();
        }System.out.println("another way");
        for(int i=1;i<=n;i++){
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }System.out.println();
        }
    }
}