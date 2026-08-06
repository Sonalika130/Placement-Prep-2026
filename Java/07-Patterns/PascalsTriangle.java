//mathematical relation
//1st n last no of every row is 1
//in between no is sum of above nums
//adjacent num is also added
public class PascalsTriangle {
    public static void main(String[] args) {
       int n=5;
       for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i+1;j++){
            System.out.print(" ");
        }int num=1;
        for(int j=1;j<=i;j++){
            System.out.print(num+" ");
            num=num*(i-j)/(j+1);
        }System.out.println();
       } 
    }
}
