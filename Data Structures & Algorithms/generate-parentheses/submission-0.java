class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> lst = new ArrayList<>();
        backtrack(lst,"",0,0,n);
        return lst;
    }

    public void backtrack(List<String> lst, String str, int open, int close, int max){
        if(max*2 == str.length()){
            lst.add(str);
            return;
        }

        if(open < max){
            backtrack(lst,str+"(",open+1,close,max);
        }

        if(close < open){
            backtrack(lst,str+")",open,close+1,max);
        }
    }
}
