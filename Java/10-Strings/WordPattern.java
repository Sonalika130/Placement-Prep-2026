//use of two hashamps
//it maps word to pattern no use of frquency or index
//use of containskey.get and put
//use of mapping from both direction,a-dog,dog-a
//as java doesnt allow both datatype maping at at time
//t-o(n),s-o(n)
import java.util.*;
public class WordPattern {
    public static boolean wordPattern(String pattern,String s){
        //for word to character
        HashMap<String,Character>wordToChar=new HashMap<>();
        //for character to word
        HashMap<Character,String>charToWord=new HashMap<>();
        //use of split gives words with space and stor eit instring[]
        //i.e.collection of string
        String words[]=s.split(" ");//split the string whenu see a space
        if(words.length!=pattern.length()){//if not same length
            return false;
        }
        for(int i=0;i<pattern.length();i++){
    //traversing and cehcking and updating
            char ch=pattern.charAt(i);//each letter of string
            String word=words[i];//each word of words array
            //for word to pattern
            //in one direction
            if(wordToChar.containsKey(word)&&!wordToChar.get(word).equals(ch)){
                return false;

            }
            //in one opposite direction
            if(charToWord.containsKey(ch)&&!charToWord.get(ch).equals(word)){
                return false;
            }//if map doesnt contain then add
            wordToChar.put(word,ch);
            charToWord.put(ch,word);

            
            }
            return true;
        }
        public static void main(String[] args){
            String pattern="abba";
            String s1="dog cat dog cat";
            String s="dog cat cat dog";
            System.out.println(wordPattern(pattern,s));
                        System.out.println(wordPattern(pattern,s1));


        }
        }
    

    
    

