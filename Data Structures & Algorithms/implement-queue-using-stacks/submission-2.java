class MyQueue {
    Stack<Integer> stk;
    Stack<Integer> helperStk;

    public MyQueue() {
        stk = new Stack<>();
        helperStk = new Stack<>();
    }
    
    public void push(int x) {
        stk.push(x);
    }
    
    public int pop() {
        peek();
        return helperStk.pop();
    }
    
    public int peek() {
        if(helperStk.isEmpty()){
            while(!stk.isEmpty()){
                helperStk.push(stk.pop());
            }
        }
        return helperStk.peek();
    }
    
    public boolean empty() {
        return helperStk.isEmpty() && stk.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */