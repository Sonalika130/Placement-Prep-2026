//skip commas,spaces,and other special characters
//convert into lowercase
//two pointer,left,right
//if left and right of string not same then also false
//Character.isLetterOrDigit()
//Character.toLowerCase(valid character)
//t-O(1),s-O(n)
import java.util.*;
public class ValidPalindromee{
    public static boolean validPalindrome(String s){
        int left=0;//1st element
        int right=s.length()-1;
        //traversing and checking through each character o fthe string
        //middle is always same,traversing and checking left and right of the middle equal/same or not
        while(left<right){
            //check if the character is letter/digit
            //for left side
            //discard all invalid characters
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;

            }
            //for right characters 
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                    right--;
            }
              //convert all valid characters to lowercase
              char leftChar=Character.toLowerCase(s.charAt(left));
              char rightChar=Character.toLowerCase(s.charAt(right));
              //chech if left and right are equal or not
              if(leftChar!=rightChar){
                return false;
              }
              //if not move to next character of both
              left++;
              right--;



        }
        //if both side chars same and middle always same
        return true;

    }
    public static void main (String[] args){
        String s1="A man,a plan,a canal: Panama";
        System.out.println(validPalindrome(s1));
    }
}