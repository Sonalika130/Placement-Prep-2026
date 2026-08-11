//find numbers<current element
//last Element is always Leader as nothing after it to check if smaller thann it
//so from right keep checking and find the elements
//put the elements into an arraylist 
//and reverse as it has reverse method
//t-o(n),s-O(n)
import java.util.*;//arraylist
public class Leader {
    //returning an arraylist not array of arraylist ,ArrayList[]
    public static ArrayList <Integer> leaders(int arr[]){
        ArrayList<Integer> list=new ArrayList<>();
        int maxRight=Integer.MIN_VALUE;//last element is always leader
        //traversing backward as all the numbers greater thn last will be checked and updated with numbers after them
        //i.e.,traversing right to left
        for(int i=arr.length-1;i>=0;i--){
            //if current>maxright then stored
            if(arr[i]>maxRight){
                maxRight=arr[i];
                list.add(arr[i]);//add in arraylist
            }



        }
        //output asked for in reverse order i.e. original order
        Collections.reverse(list);
        return list;
    }
    public static void main(String[] args){
        int arr[]={16,17,4,3,5,2};
        System.out.println("leaders:"+(leaders(arr)));
    }

    
}
