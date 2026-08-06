//sum of its proper divisor >number
//proper divisor=all except the no itself
//12(1,2,3,4,6)16>12
public class AbundantNo {
    public static boolean abundantNo(int n){
        
        int sum=0;
        for(int i=1;i<=n/2;i++){//optimization
            if(n%i==0&&i!=n)
                sum+=i;

        }
        return sum>n;
    }
    public static void main(String[] args) {
        boolean bool=abundantNo(13);
        System.out.println("abundant no:"+bool);
    }
    
}
