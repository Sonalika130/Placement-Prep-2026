//optimal sol
//""-empty string " "-string with space
//string.startsWith(),use of while loop,.substring()
//every word starts with prefix if not decrease the length of prefix
//// Edge case: no common prefix → prefix becomes ""
// startsWith("") is true, so while loop stops
// final return prefix returns ""
//t-O(n),s-O(n)
public class LongestCommonPrefixOptimal {
public static String longestComPrefix(String st1[]){
    //we gotta take prefix as the first word in the array as reference
    String prefix=st1[0];
    //traverse through all the other wors in the string array
    for(int i=1;i<st1.length;i++){
        //not if coz we aint checking once but we keep checking
        //cond-if st1s next word not starting with prefix that is first word
        //keep moving
        while(!st1[i].startsWith(prefix)){
            //lessen the length of the prefix/firstword
            //after lessening it stored in prefix then checked if not again then new ones length got lessen again
            prefix=prefix.substring(0,prefix.length()-1);
            //edge case but while loop naturally handling it so need of extra if
            //if(prefix.length()==0){
             //   return "";
            //}

        }


    }
    return prefix;//as if 2nd ones prefix is part of 1st then 3rs shd also hv the same
}
public static void main(String[] args){
    String []s1={"flower","fly","flow"};
    String s2[]={"aab","ab"};
    String s3[]={"dog","cat","catastrophe"};
    System.out.println("longest common prefix: "+longestComPrefix(s1));
        System.out.println("longest common prefix: "+longestComPrefix(s2));

            System.out.println("longest common prefix: "+longestComPrefix(s3));

}

}
