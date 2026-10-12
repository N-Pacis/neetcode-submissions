class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);

        int left = 1;
        int right = piles[piles.length - 1];
        int res = Integer.MAX_VALUE;

        while (left <= right){
            int mid = left + (right - left)/2;
            long x = 0L;

            for(int i=0; i< piles.length; i++){
                x += (piles[i]+ mid - 1) / mid;
            }

            if(x > h) left = mid + 1;
            else{
                res = mid;
                right = mid - 1;
            }
        }

        return res;
    }
}
