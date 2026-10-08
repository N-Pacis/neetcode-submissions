class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for(int i=0;i<nums.length - 1;i++){
            int left = i + 1;
            int right = nums.length - 1;

            if(i>0 && nums[i] == nums[i-1]) continue;

            while(left < right){ 
                int x = nums[i] + nums[left] + nums[right];
                
                if(x == 0) {
                    res.add(new ArrayList<>(List.of(nums[i], nums[left], nums[right])));
                    
                    //skip duplicates
                    while(left < right && nums[left] == nums[left+1]){
                        left++;
                    }

                    while(left < right && nums[right] == nums[right-1]){
                        right--;
                    }
                }

                if(x < 0){
                    left++;
                }else{
                    right--;
                }
            }
        }

        return res;
        
    }
}
