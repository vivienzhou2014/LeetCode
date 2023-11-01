public class ValidSudoku36 {
    public boolean isValidSudoku(char[][] board) {
        int[][] row = new int[9][9];
        int[][] col = new int[9][9];
        int[][] block = new int[9][9];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                if(board[i][j] == '.'){
                    continue;
                }
                int num = board[i][j] - '0' - 1;
                if(row[i][num] == 1){return false;}
                if(col[j][num] == 1){return false;}
                if(block[i/3*3 + j/3][num] == 1){return false;}
                row[i][num] = 1;
                col[j][num] = 1;
                block[i/3*3 + j/3][num] = 1;
            }
        }
        return true;
    }
}
