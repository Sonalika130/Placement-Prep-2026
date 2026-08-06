//1
//22
//333
//4444
class Pattern4{
    public static void main(String[] args){
            int n=5;
            for (int i=1;i<=n;i++){
                //1,22,333
                for(int j=1;j<=i;j++){
                    System.out.print(i+" ");
                }
                System.out.println();
            }
    }
}