class Solution {

    public int maxProfit(int[] prices) {
       int minprice = Integer.MAX_VALUE;
       int res = 0;
        
       for(int i=0;i<prices.length;i++){
        if(prices[i] < minprice){
            minprice = prices[i];
        }else{
            res = Math.max(res, prices[i] - minprice);
        }
       }

       return res;
    }
}