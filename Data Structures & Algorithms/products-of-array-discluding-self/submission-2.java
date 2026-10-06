class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int[] prefix = new int[nums.length + 1];
        int[] suffix = new int[nums.length + 1];

        int n = nums.length;
        prefix[0] = 1;
        suffix[n-1] = 1;

        //construct the prefix array
        for(int i=1; i<=n; i++){
            prefix[i] = prefix[i - 1] * nums[i-1];
        }

        //construct the suffix array
        for(int i=n-2;i>=0;i--){
            suffix[i] = suffix[i+1] * nums[i+1];
        }

        //use the prefix array to compute positions using the formula
        for(int i=0; i<n;i++){
            res[i] = prefix[i] * suffix[i];
        }

        return res;
    }

}  
