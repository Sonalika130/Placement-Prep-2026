//majority element but optimal
//t-O(n),s-O(1)
//one candidate and opponenet is chosen
//w each candidt's vote count++,opponents count--;, cancelling eo
//so no use  of hashmap as we not storing frequnecy
//candidates must be present>n/2 times,initiate with count=0
//Whenever we see a different number, we can cancel one occurrence of our current candidate.
//Because the majority element occurs more than half, it will have enough occurrences to survive all those cancellations.
//count aint frequency but balance after cancelling different elements
//Boyer–Moore directly works when the problem guarantees that a majority element exists. If the problem doesn't guarantee it, we need a second pass to verify that candidate actually occurs more than n/2 times.
//simply,candidate=current number,count=survival strength,
//same -> +1,different-> -1;count=0 choose a new candidate
//majority has more than half elements it cant be compleletely eliminated 
public class BoyerMooreVotingAlgo {
    public static int boyerMooreVoting(int arr[]){
        int candidate=0;//initially noone
        int count=0;//initially
        //use of no indices we need only elements
        for(int num:arr){
            if(count==0)//choose a new candidate
            candidate=num;//assign number to candidate
            if(candidate==num)//same
                count++;
            else
                count--;//if not same
        }
        //majority element because it survivded all cancellation
        return candidate;


    }
    public static void main(String[] args){
        int arr[]={2,2,1,2,1,2,1};
        System.out.println("majority element(frequency>arr.length)/2) is : "+boyerMooreVoting(arr));
    }
    }
    

