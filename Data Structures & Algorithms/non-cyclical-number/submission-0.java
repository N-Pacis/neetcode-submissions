class Solution {
    public boolean isHappy(int n) {
        int sum = 0;
        int number = n;
        Set<Integer> seen = new HashSet<>();

        while(true){
            sum += (number % 10) * (number % 10);
            number /= 10;

            if(number == 0){
                if (sum == 1) return true;
                else if(seen.contains(sum)) return false;

                seen.add(sum);
                number = sum;
                sum = 0;
            }
        }
    }
}
