//check if contain of 2 strings same
//.equals
public class Equals{
    public static void main(String[] args){
        String s1="hello";
        String s2="hello";
        //string compares as a<b so vello is higher in value
        String s3="vello";
        if(s1.equals(s2))
            System.out.println(true);
        if(s1.equals(s3))
            System.out.println("equal");
        else
            System.out.println("not equal");
    }
}