class Solution {
    private boolean isValid( int mat[][] ,int row, int col){
        //backward
        int i=row,j=col;
        while(j>=0){
            if(mat[i][j] == 1) return false;
            j--;
        }
         i=row;
         j=col;
        while(i>=0 && j>=0){
            if(mat[i][j] == 1) return false;
            i--;
            j--;
        }
        i=row;
        j=col;
        while(i<mat.length && j>=0){
            if(mat[i][j]==1) return false;
            i++;
            j--;
        }
        return true;
    }
    private void solveNQueens(int mat[][] , List<List<String>> ans , int col , int n){
        if(col == n){
            List<String> cur = new ArrayList<>();
            for(int row[] : mat){
                String r = "";
                for(int data : row){
                    r+=data == 1 ? "Q":".";
                }
                cur.add(r);
            }
             ans.add(cur);
                return;
        }
            for(int row = 0; row<n; row++){
                if(isValid(mat , row , col)){
                    mat[row][col] = 1;
                    solveNQueens(mat,ans,col+1,n);
                    mat[row][col] = 0;
                }
            }
    }
    public List<List<String>> solveNQueens(int n) {
        int mat[][] = new int[n][n];
        List<List<String>> ans = new ArrayList<>();
        solveNQueens(mat,ans,0,n);
        return ans;
    }
}