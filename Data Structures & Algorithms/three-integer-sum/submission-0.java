class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();

        for(int i=0;i<nums.length - 1;i++){
            int left = i + 1;
            int right = nums.length - 1;

            while(left < right){ 
                int x = nums[i] + nums[left] + nums[right];
                
                if(x == 0) {
                    res.add(new ArrayList<>(List.of(nums[i], nums[left], nums[right])));
                }

                if(x < 0){
                    left++;
                }else{
                    right--;
                }
            }
        }

        return new ArrayList<>(res);
        
    }
}
