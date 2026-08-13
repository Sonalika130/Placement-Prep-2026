//evry day new price
//greedy approach,local decision and track of best
//if price is in decreasing order maxprofit will be 0
//minprice(cheapest price),profit everyday from minprice,maxprofit
//at every day, keep the cheapest price seen so far, then calculate the profit if we sell today.
//t-O(n),s-O(1)-as space const as space not increasing with n 

public class StockBuyANDSell {
    public static int stockBuyNSell(int arr[]){
        //cheapest price initiated w 1st element
        int minPrice=arr[0];
        //int profit=0;no need
        int maxProfit=0;//cant be -ve
        for(int i=1;i<arr.length;i++){
            minPrice=Math.min(minPrice,arr[i]);
            //selling price-buying price
            int profit=arr[i]-minPrice;
            maxProfit=Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
    public static void main(String[] args){
        int arr1[]={7,1,5,3,6,4};
        //everyday prices r decreasing,so maxprofit initiated w 0
        int arr2[]={7,6,5,4,3,2,1};
        System.out.println("maximum profit from buying and selling stock:"+stockBuyNSell(arr1));
        System.out.println("maxprofit of stock buying and selling(prices decreasing everyday: "+stockBuyNSell(arr2));
    }
    
}
