public class Armstrong {
    public static boolean isArmstrong(int n){
        int count=0;
        int num=n;
        while(n!=0){
            n/=10;
            count++;

        }
        n=num;
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum+=(int)Math.pow(rem,count);
            n/=10;

        }
        return sum==num;
    }
    public static void main(String[] args) {
        boolean bool=isArmstrong(153);
        System.out.println("armstrong: "+bool);
    }
    
}
