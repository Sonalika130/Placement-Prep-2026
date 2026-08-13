import java.util.*; 
public class MaximumElement {
    public static int maxElement(int arr[][]){
    
        
        int max=arr[0][0];//for both +ve and -ve
        for(int i=0;i<arr.length;i++){//java knows itself how many rows
            for(int j=0;j<arr[i].length;j++){//java knows how many cols in each row
                if(arr[i][j]>max){
                    max=arr[i][j];              
                  }
            }
        }
        return max;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][2];
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int arr2[][]={{1,2,3},{4,5,6}};
        System.out.println("maximum element:"+maxElement(arr));
                System.out.println("maximum element:"+maxElement(arr2));

    }
}