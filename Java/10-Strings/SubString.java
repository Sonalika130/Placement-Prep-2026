//small part of string
//consists of starting index and ending index
//.substring(start,end),bydefault end index is always  there as arr.length
//but word considerd at start index and upto end index i.e.,.length-1
//string always start with 0 but consiiderd without 0 i.e., 
//hello - 0 to 5 but no-6

public class SubString {
    public static void main(String args[]){
        String s1="hello this is sonalika";
        System.out.println(s1.substring(0,5));
        System.out.println(s1.substring(5));

    }
    
}
