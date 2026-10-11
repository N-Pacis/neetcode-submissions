class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<Integer> temps = new Stack<>();

        for(int i=0; i<temperatures.length; i++){
            int x = temperatures[i];

            while(!temps.empty() && temperatures[temps.peek()] < x){
                res[temps.peek()] = i - temps.peek();
                temps.pop();
            }

            temps.push(i);
        }


        return res;   
    }
}
