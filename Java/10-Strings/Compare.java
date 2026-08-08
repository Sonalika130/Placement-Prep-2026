public class Compare {
    public static void main(String[] args){

        String s1="hello";
        String s2="hello";
        //compareto checks-
        //s1==s2-0
        //s1>s2-+ve val
        //s1<S2- -ve val
        if (s1.compareTo(s2)==0)
            System.out.println("strings are equal");
        else
            System.out.println("strings are not eqaul");
        //s1==s2,returns same but somtimes donot work so better .compareTo
    }


}
    

