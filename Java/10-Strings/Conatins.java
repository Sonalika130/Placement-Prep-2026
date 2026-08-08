//if a string contains another string
//array is og,but string is like but object of string class
//.contains differnet from hashset,hashmap
public class Conatins {
    public static void main(String[] args){
        String st="hello my name is rohan";
        String s="rohan";
        //both approach same and return true
        if(st.contains(s))
            System.out.println("true");
        else
            System.out.println(false);
        System.out.println(st.contains(s));

    }
    
}
