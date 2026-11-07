class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> substring = new HashSet<>();
        int max = 0;
        int left = 0;

        for(int i=0; i<s.length(); i++){
            while (substring.contains(s.charAt(i))){
                substring.remove(s.charAt(left));
                left++;
            }
            substring.add(s.charAt(i));
            max = Math.max(max, i - left + 1);
        }

        return max;
    }
}
