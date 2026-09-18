class Solution {
    public boolean exist(char[][] board, String word) {
        int n = board.length; //row
        int m = board[0].length;
        boolean[][] vis = new boolean[n][m]; //visited array
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(board[i][j] == word.charAt(0)){
                    boolean result = backtrack(board,vis,word,i,j,0);
                    if(result) return true;
                }
            }
        }

        return false;
    }

    public boolean backtrack(char[][] board, boolean[][] vis, String word, int i, int j, int index){
        if(index == word.length()) return true;

        if(i >= board.length || j >= board[0].length || i < 0 || j < 0 || vis[i][j] || word.charAt(index) != board[i][j]) return false;

        vis[i][j] = true;

        if(backtrack(board,vis,word,i-1,j,index+1) || backtrack(board,vis,word,i,j+1,index+1) ||
        backtrack(board,vis,word,i+1,j,index+1) || backtrack(board,vis,word,i,j-1, index+1)){
            return true;
        }
        vis[i][j] = false;
        return false;
    }
}
