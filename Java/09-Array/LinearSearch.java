//method for reusability
//linear search->O(n)
//edge case-> -1(not found)
//managa
//index-0 to n

import java.util.*;
public class LinearSearch{
    public static int linearSearch(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            //sopln(i)->all occurence of target
            if(arr[i]==target)
                return i;
            //index=i->last occurence
        }
        //return index->last occurence

        return -1;//not found->(-1)out of indexing

    }
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter size");
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();

            }
            System.out.println("enter number to search");
            int key=sc.nextInt();
            int index=linearSearch(arr,key);
            if(index==-1)
                System.out.println("element not found");
            else
                System.out.println("element found at "+index+" position");

    }
}