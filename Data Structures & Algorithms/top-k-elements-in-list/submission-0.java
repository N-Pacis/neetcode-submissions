class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        //initialize a hashmap
        Map<Integer, Integer> count = new HashMap<>();
        //bucket sort
        List<Integer>[] frequency = new List[nums.length + 1];

        //initialize frequency array
        for(int i=0;i<frequency.length;i++){
            frequency[i] = new ArrayList<>();
        }

        //loop through the array and add increase count per key
        for(int num: nums){
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : count.entrySet()){
            frequency[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int index = 0;
        for(int i=frequency.length - 1; i >= 0; i--){
            if (index == k) break;
            if(frequency[i].size() > 0){
                for(Integer n : frequency[i]){
                    if (index == k) break;
                    res[index] = n;
                    index++;
                }
            }
        }

        return res;

    }
}
