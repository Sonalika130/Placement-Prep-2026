//convert the string into character array
//then can be performed aray opertions on it
import java.util.*;
public class ToCharArray {
    public static void main(String[] args){
    String st=new String("hello hi namaste");
    //declare a character array to store values as an array
 char ch[]=st.toCharArray();   
 System.out.println(Arrays.toString(ch));
 //each character
 for(int i=0;i<ch.length;i++){
    System.out.print(ch[i]+" ");
 } 
}
}
