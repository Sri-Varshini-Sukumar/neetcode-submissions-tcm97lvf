class Solution {
    public boolean isSafe(int row, int col, char[][] board){
        //horizontal direction
        for(int i=0; i<board.length; i++){
            if(board[row][i] == 'Q') return false;  
        }

        //vertical direction
        for(int i=0; i<board.length; i++){
            if(board[i][col] == 'Q') return false; 
        }
        //upper left diagonal
        int r = row;
        int c = col;
        for(c=col; c >= 0 && r >= 0; r--,c--){
            if(board[r][c] == 'Q') return false;
        }
        //upper right diagonal
        r=row;
        for(c=col; r>=0 && c<board.length; r--, c++){
            if(board[r][c] == 'Q') return false;
        }
        //lower left diagonal
        r=row;
        for(c=col; r<board.length && c>=0; r++, c--){
            if(board[r][c] == 'Q') return false;
        }

        //lower right diagonal
        c=col;
        for(r=row; r<board.length && c<board.length; r++,c++){
            if(board[r][c] == 'Q') return false;
        }

        return true;
    }

    public void saveBoard(char[][] board, List<List<String>> allBoards){
        String row = "";
        List<String> newBoard = new ArrayList<>();

        for(int i=0; i<board.length; i++){
            row = "";
            for(int j=0; j<board.length; j++){
                if(board[i][j] == 'Q'){
                    row += 'Q';
                }else{
                    row += '.';
                }
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }
    public void helper(char[][] board, List<List<String>> allBoards, int col){
        //base case
        if(col == board.length){
            saveBoard(board,allBoards);
            return;
        }

        for(int row=0; row<board.length; row++){
            if(isSafe(row,col,board)){
                board[row][col] = 'Q';
                helper(board,allBoards,col+1);
                board[row][col] = '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];

        helper(board,allBoards,0);

        return allBoards;
    }
}
