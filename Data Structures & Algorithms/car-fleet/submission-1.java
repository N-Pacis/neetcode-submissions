class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        List<double[]> cars = new ArrayList<>();
        Stack<Double> res = new Stack<>();

        for(int i=0; i<position.length; i++){
            cars.add(new double[]{position[i], (target - position[i])/ (double) speed[i]});
        }

        cars.sort((a,b)-> Double.compare(b[0], a[0]));

        for(double[] car : cars){
            if(res.empty() || res.peek() < car[1] ){
                res.add(car[1]);
            }
        }

        return res.size();
    }
}
