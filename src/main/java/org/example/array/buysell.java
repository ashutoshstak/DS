package org.example.array;

public class buysell {

    public static void main(String[] args) {
        int[] arr = {2,4,1};
        System.out.print(maxProfit(arr));
    }
    public static int maxProfit(int[] prices) {
        // okay so lets first find the smallest element if it exist in the array and the index for the same
        int minindex = Integer.MAX_VALUE;
        int minelement = Integer.MAX_VALUE;
        for(int i=0;i<prices.length; i++){
            // now go one by one and check for the minimum index
            if(prices[i] < minelement){

                minelement = prices[i];
                minindex = i;
            }
            // so till here we will be able to find out them min index
        }
        // so now if the min index has been found then we will basically start checking for the time after the min index to sell the stock
        int sellindex = Integer.MIN_VALUE;
        int sellelement = Integer.MIN_VALUE;
        for (int i = minindex+1; i<prices.length; i++){
            // now check that if the value is higher then the min index element
            if(prices[i] > minelement && prices[i] > sellelement){
                sellelement =  prices[i];
                sellindex = i;
            }
        }
// now we need to return the max - min
        if(sellindex == Integer.MIN_VALUE){
            System.out.println("sell price "+minelement);
            return 0;
        }else{
            System.out.println("sell price "+sellelement);
            return sellelement - minelement;
        }

    }
}
