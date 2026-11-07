class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        Map<Character, Integer> charCount = new HashMap<>();
        int res = 0;

        while (right < s.length()){
            //update frequency map
            charCount.put(s.charAt(right), charCount.getOrDefault(s.charAt(right), 0) + 1);
            
            //find the most frequent character in the current window;
            //get the occurence of it
            int mostFrequent = Collections.max(charCount.values());
            
            while((right-left + 1) - mostFrequent > k){
                charCount.put(s.charAt(left), charCount.get(s.charAt(left)) - 1);
                left++;
            }
        
            res = Math.max(res, right - left + 1);
            right++;

        }
        return res;
    }
}
