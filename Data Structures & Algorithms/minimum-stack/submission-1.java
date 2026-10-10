class MinStack {
    Stack<Integer> res; 
    Stack<Integer> minElements;

    public MinStack() {
        this.res = new Stack<>();
        this.minElements = new Stack<>();
    }
    
    public void push(int val) {
        res.push(val);
        if(minElements.empty()) minElements.push(val);
        else minElements.push(Math.min(minElements.peek(), val));
    }
    
    public void pop() {
        res.pop();
        minElements.pop();
    }
    
    public int top() {
        return res.peek();
    }
    
    public int getMin() {
        return minElements.peek();
    }
}
