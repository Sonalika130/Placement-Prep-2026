public class Automorphic {
    public static boolean automorphicNo(int num){
        long sq=num*num;
        int n=num;
        while(num!=0){
            if(num%10==sq%10){
                num/=10;
                sq/=10;
            }
            else
                return false;
        }
                
        return true;
    }
    public static void main(String[] args) {
        boolean bool=automorphicNo(25);
        System.out.println("automorphic:"+bool);
    }
    
}
