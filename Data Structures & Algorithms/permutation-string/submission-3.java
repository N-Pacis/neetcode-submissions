class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length() < s1.length()) return false;
        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        //count character occurences in s1;
        for(Character c: s1.toCharArray()){
            s1Count[c-'a']++;
        }

        int left = 0;
        int right = s1.length() - 1;

        for(int i=left; i<right; i++){
            s2Count[s2.charAt(i) - 'a']++;
        }

        while(right < s2.length()){
            //increment incoming char
            s2Count[s2.charAt(right) - 'a']++;

            if(Arrays.equals(s1Count, s2Count)) return true;

            //decrement outgoing char
            s2Count[s2.charAt(left) - 'a']--;

            left++;
            right++;
        }

        return false;
    }
}
