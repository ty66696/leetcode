package leetcode.arrays.simple;

public class test0999 {
    public int numRookCaptures(char[][] board) {
        int m=0,n=0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j]=='R') {
                    m = i;
                    n = j;
                }
            }
        }
        int index = 0;
        int i = m;
        while (i>=0&&board[i][n]!='B'){
            if(board[i][n]=='p'){
                index++;
                break;
            }
            i--;
        }
        i=m;
        while (i<board.length&&board[i][n]!='B'){
            if(board[i][n]=='p'){
                index++;
                break;
            }
            i++;
        }
        int j = n;
        while (j>=0&&board[m][j]!='B'){
            if(board[m][j]=='p'){
                index++;
                break;
            }
            j--;
        }
        j=n;
        while (j<board[0].length&&board[m][j]!='B'){
            if(board[m][j]=='p'){
                index++;
                break;
            }
            j++;
        }
        return index;
    }
}
