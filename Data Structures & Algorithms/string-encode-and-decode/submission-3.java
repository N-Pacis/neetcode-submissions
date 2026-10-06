class Solution {

    public String encode(List<String> strs) {
        //what if we convert every string into ascii numbers and then join them using a non ascii character>?
        String res = "";

        for(String str: strs){
            for (char c: str.toCharArray()){
                res += Integer.toString((int) c) + ";";
            }
            res += ",";
        }
        //drop the extra comma
        if(!res.isEmpty()){
            return res.substring(0, res.length() - 1);
        }

        return null;
    }

    public List<String> decode(String str) {
        if(str == null) return new ArrayList<>();
        
        String[] words = str.split(",", -1);
        List<String> res = new ArrayList<>();

        for(String word: words){
            String r = "";

            String[] letters = word.split(";", -1);
            for(String letter: letters){
                if (letter != ""){
                    r += (char) Integer.parseInt(letter);
                }
            }

            res.add(r);
        }

        return res;
    }
}
