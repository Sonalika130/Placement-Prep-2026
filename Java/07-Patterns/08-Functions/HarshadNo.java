//no divisible by its sum of digits
//e.g.,18
public class HarshadNo {
    public static boolean harshadNo(int n){
        int num=n;
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum+=rem;
            n/=10;


        }
        return num%sum==0;
        //if(num%sum==0)
            //return true;
        //else
           // return false;
    }
    public static void main(String[] args) {
        boolean bool=harshadNo(18);
        System.out.println("harshad no:"+bool);

    }
}
