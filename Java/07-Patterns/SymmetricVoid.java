public class SymmetricVoid {
    public static void main(String[] args) {
        //two halfs for rows=8
        int n=4;
        //upper half
        //left star
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }//space
            for(int j=1;j<=2*(i-1);j++){
                System.out.print(" ");
            }//right star
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }//new line after every
            System.out.println();
        }
            //lower half
            //left star
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


       }
    }
    

