class Solution {
    public boolean isValid(int i , int j , char k , char[][]board){
        for(int var = 0; var < 9; var++){
            if(board[i][var]==k || board[var][j]==k) return false;
            if(board[3*(i/3)+var/3] [3*(j/3)+var%3] == k) return false;
        }
        return true;
    }
    public boolean solve(char[][] board){
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j]=='.'){
                    for(char k = '1'; k<='9'; k++){
                       if(isValid(i,j,k,board)){
                         board[i][j] = k;
                         if(solve(board)) return true;
                         board[i][j]='.';
                       }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        solve(board);
    }
}