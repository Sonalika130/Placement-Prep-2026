public class Minimumelement {
    public static int minelement(int arr[][]){
        int min=arr[0][0];//for both +ve and -ve element
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]<min){
                    min=arr[i][j];
                }

            }
        }
        return min;
    }
    public static void main(String args[]){
        int arr[][]={{10,2,3},{67,98,990}};
        System.out.println("min element:"+minelement(arr));
    }
    
}
