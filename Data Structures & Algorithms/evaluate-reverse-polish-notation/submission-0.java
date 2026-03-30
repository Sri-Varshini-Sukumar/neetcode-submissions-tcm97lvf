class Solution {
    public int evalRPN(String[] tokens) {
        int n = tokens.length;
        Stack<Integer> stk = new Stack<>();

        for(String ch : tokens){
            if(ch.equals("+")){
                stk.push(stk.pop() + stk.pop());
            }else if(ch.equals("-")){
                int a = stk.pop();
                int b = stk.pop();
                stk.push((int)(b-a));
            }else if(ch.equals("*")){
                stk.push(stk.pop() * stk.pop());
            }else if(ch.equals("/")){
                int a = stk.pop();
                int b = stk.pop();
                stk.push(b/a);
            }else{
                stk.push(Integer.parseInt(ch));
            }
        }
        return stk.peek();
    }
}
