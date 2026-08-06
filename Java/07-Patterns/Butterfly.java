public class Butterfly {
    public static void main(String[] args) {
        //2 halves
        int n=4;
        //upper half
        //left   star
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }//space
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }//right star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }System.out.println();
        }
            //lower half
            //left star
            //for(int i=2;i<=n;i++){if rows asked =7
            for(int i=1;i<=n;i++){//if same 2 lines wanted,rows=8

                for(int j=1;j<=n-i+1;j++){
                    System.out.print("*");
                }//space
                for(int j=1;j<=2*(i-1);j++){
                    System.out.print(" ");
                }//right stars
                for(int j=1;j<=n-i+1;j++){
                    System.out.print("*");
                }System.out.println();
            
        }
    }
    
}
