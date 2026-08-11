//use of arraylist,its size is not fixed unlike array
//it includes get(i),add(val),set(i,val),remove(val),contains(val),size()
//use of Collections.sort(arraylist)-collection classes can be sorted like this
//use of string.toCharArray()-as string directly cant be manipulated
//so 1st- find vowels,sort them,in the string if consonant leave and move to next if vowel ,
//replace with the vowel of the sorted but as per the order its in the sorted list
//t-O(n log n),s-o(n)
import java.util.*;//for accessing arraylist
public class SortVowels {
    public static String sortVowels(String s){
        //character arraylist for storing vowels
        ArrayList<Character> vowels=new ArrayList<>();
        //traversing through the string for accessing the character
        for(int i=0;i<s.length();i++){
            //converting everything to lowercase so
            //letters in string in uppercase but we using lowercase
            char ch=Character.toLowerCase(s.charAt(i));
            //if character is vowel
            if(ch== 'a'|| ch == 'e' ||ch=='i' ||ch=='o' ||ch=='u'){
                vowels.add(s.charAt(i));//storing og version

            }
            
        }
        //sort the vowels
        //for sorting collection classes like arraylist,arraylist containing character
        Collections.sort(vowels);
        //convert the string into a character array,
        //as string is immutable,charactrs in it cant be manipulated directly
        //so use of characterarray make it wasy to store/replace
        char result[]=s.toCharArray();
        int index=0;//for accessing the sorted vowels
        //traversing through character array to replace vowels with sorted vowels order
        for(int i=0;i<result.length;i++){
            char ch=Character.toLowerCase(result[i]);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                //replace the vowels in chararray with the vowel in sorted arraylist
                result[i]=vowels.get(index);
                index++;//next vowel in sorted arraylist(vowels)

            }
        }
        return new String(result);

        
    }
    public static void main(String[] args){
        //if like this sorted will be first uppercase then lowercase-lEETcOde
        //String s="lEeTcOdE";//string always in double quotes
        String s="lEETcOdE";
        System.out.println((sortVowels(s)));
    }
    
}
