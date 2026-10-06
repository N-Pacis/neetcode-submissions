class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //Initialize final result
        List<List<String>> res = new ArrayList<>();
        //create a hashmap of string and set
        HashMap<String, List<String>> anagrams = new HashMap<>();

       //Sort a word
       for(String str: strs){
        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        String sorted = new String(chars);

        if(anagrams.containsKey(sorted)){
            //exist add it to set
            List<String> related = new ArrayList<>(anagrams.get(sorted));
            related.add(str);
            anagrams.put(sorted, related);
        }else{
            //not exist in hashmap keys? add it with the sorted element as key and unsorted as first element
            anagrams.put(sorted, List.of(str));
        }
       }

       //loop through hashmap values and construct the final output
        for(List<String> related: anagrams.values()){
            res.add(related);
        }

        return res;
    }
}
