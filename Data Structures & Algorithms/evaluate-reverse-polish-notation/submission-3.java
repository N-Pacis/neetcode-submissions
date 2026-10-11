class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> operands = new Stack<>();

        for(int i=0; i<tokens.length; i++){
            String x = tokens[i];
            if(!"+-*/".contains(x)){
                operands.push(Integer.parseInt(x));
            }else{
                operands.push(calculate(operands.pop(), operands.pop(), x));
            }
        
        }
        
        return operands.pop();
    }

    private int calculate(int y, int x, String operation){
        if(operation.equals("+")) return x + y;
        else if(operation.equals("-")) return x - y;
        else if(operation.equals("*")) return x * y;
        else if(operation.equals("/")) return x / y;
        else return 0;

    }
}
