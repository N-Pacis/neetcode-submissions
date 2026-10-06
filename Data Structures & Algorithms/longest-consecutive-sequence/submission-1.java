class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> res = new HashSet<>();
        int largestSequence = 0;

        for(int i=0;i<nums.length;i++){
            res.add(nums[i]);
        }

        for(Integer num: res){
            if(!res.contains(num - 1)){
                //start of a possible sequence
                int index = 1;
                while (true){
                    if(!res.contains(num+index)) break;
                    index++;
                }

                largestSequence = Math.max(largestSequence, index);
            }
        }

        return largestSequence;
    }
}
