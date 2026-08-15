//brute force solution
//an array of string is given
//each words prefix is checked and returned if theres any
//i is used for checking each character
//j is used for each word
//if the characters at each word match keep going and add
//if one of the word smaller or just does not match just return " "
//t-O(n^2),s-o(n)
import java.util.*;
public class LongestCommonPrefixBrute {
    public static String longestComPrefix(String []st){
        String prefix="";//no space
        for(int i=0;i<st[0].length();i++){//scanning each character of words also length()used as a string
            //first word as reference to be checked w others
            char ch=st[0].charAt(i);//each word of 1st word w each word of others
            //next word of string array length for how many words in total  there in that string
            for(int j=1;j<st.length;j++){
                //we check the length of reference with the next word as it might be smaller
                //so prefix will be a problem to find
                //!st[j].charAt(i).equals(ch)).equals for string only no chars primitive

                if(i>=st[j].length()|| st[j].charAt(i)!=(ch)){
                    return prefix;
                }

            }
            prefix+=ch;

        }
        return prefix;


    }
    public static void main(String[] args){
        String[] st={"flower","flow","fly"};
        String[] st1={"aba","ab"};//string array
        System.out.println("longest common prefix: "+longestComPrefix(st));
                System.out.println("longest common prefix: "+longestComPrefix(st1));

        
    }
    
}
