class Solution {
    public boolean isValid(String s) {
        Stack<Character> res = new Stack<>();

        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);

            if(c == '(' || c == '{' || c == '[') res.push(c);
            else{
                if (res.empty()) return false;
                else if(c == ')' && res.peek() != '(') return false;
                else if(c == '}' && res.peek() != '{') return false;
                else if(c == ']' && res.peek() != '[') return false;
                else res.pop();
            }
            
        }

        return res.empty();
    }
}
