//check length of strings,should be equal
//use of hashmap-frequency
//check if both string possess same number of characters
//use of one hashmap-+for 1st,- for 2nd
//O(m+n)-t but O(n)as same length,s-O(n)-space
import java.util.*;//for hashmap
public class Anagram {
    public static boolean anagram(String s1,String s2){
        //anagrams always have same length
        if(s1.length()!=s2.length())
            return false;
        //here storing char and count in hashmap
        HashMap<Character,Integer> map=new HashMap<>();
        //1st string,+count
        //to access every element of string
        for(int i=0;i<s1.length();i++){
            //putting character and its count i.e.,map.getOrDefault
            map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);

        }
        //for 2nd string-same hashmap count--
        for(int i=0;i<s2.length();i++){
            map.put(s2.charAt(i),map.getOrDefault(s2.charAt(i),0)-1);
            //so that all count ->0,count of chars in both string same
        }
        //now if 2 are of same length but theres a different character like cat,rat
        //so for accessing through hashmao
        //map.values()->count values
        //map.keySet()-keys
        //map.entrySet()-both keys and values
        //count-variable for accesing
        for(int count:map.values()){
            if(count!=0)
                return false;

        }
        return true;
    }
    public static void main(String args[]){
        String s1="anagram";
        String s2="nagaram";
        boolean bool=anagram(s1,s2);
        System.out.println("anagram :"+bool);

    }
        
    }
    
    

