class Solution {
    public boolean isValidSudoku(char[][] board) {
        int rows = board.length;
        int columns = rows > 0? board[0].length : 0;
        if(rows != 9 || columns != 9)return false;

        for(int i = 0; i < 9; i++) {
            int[] arr = new int[10];
            for(int j = 0; j < 9; j++) {
                if(board[i][j] != '.') {
                    if(arr[board[i][j] - '0'] > 0)return false;
                    arr[board[i][j] - '0']++;
                }
            }
        }

        for(int i = 0; i < 9; i++) {
            int[] arr = new int[10];
            for(int j = 0; j < 9; j++) {
                if(board[j][i] != '.') {
                    if(arr[board[j][i] - '0'] > 0)return false;
                    arr[board[j][i] - '0']++;
                }
            }
        }

        for(int i = 0; i < 9; i+=3) {
            for(int j = 0; j < 9; j+=3) {
                int[] arr = new int[10];
                for(int ii = i; ii < i +3;ii++) {
                    for(int jj =j; jj < j+3; jj++){
                        if(board[ii][jj] != '.') {
                            if(arr[board[ii][jj] - '0'] > 0)return false;
                            arr[board[ii][jj] - '0']++;
                        }
                    }
                }
               
            }
        }

        return true;
    }
}
