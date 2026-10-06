class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> valueIndices = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(valueIndices.containsKey(target - nums[i])){
                return new int[]{valueIndices.get(target - nums[i]), i};
            } 
            valueIndices.put(nums[i],i);
        }
        

        return new int[]{};
        
    }
}
