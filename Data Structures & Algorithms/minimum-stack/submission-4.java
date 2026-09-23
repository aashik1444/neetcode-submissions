class MinStack {
    public Stack<Integer> minstack;
    public Stack<Integer> stack;
    public MinStack() {
        stack = new Stack<>();
        minstack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if (minstack.isEmpty() || val <= minstack.peek()) {
            minstack.push(val);
        }
    }
    
    public void pop() {
        if (stack.isEmpty()) return;
        int t = stack.pop();
        if (t == minstack.peek()) minstack.pop();
        
    }
    
    public int top() {
        return stack.peek();
        
    }
    
    public int getMin() {
        return minstack.peek();
        
    }
}
