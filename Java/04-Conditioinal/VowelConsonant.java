import java.util.*;
class VowelConsonant{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter character:");
        char ch=sc.next().charAt(0);
        char lower=Character.toLowerCase(ch);
        if(lower>='a'&&lower<='z'){
            if(lower=='a'||lower=='e'||lower=='i'||lower=='o'||lower=='u')
                System.out.println(lower+" is vowel");
            else
                System.out.println(lower+" is consonant");
            
        }

String c = "A"; // ASCII value of 'A' is 65
//System.out.println(+c); no output
System.out.println(c); // output and display c
char cc='A';
//System.out.println(+cc); ascii value
System.out.println(cc); //display output character



    }
}
