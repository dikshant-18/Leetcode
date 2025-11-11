class Solution {
    public int numRookCaptures(char[][] board) {
        int[] directions = {-1, 0, 1, 0, -1};

        int n = board.length;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (board[row][col] == 'R') {
                    int captured = 0;
                    for (int d = 0; d < 4; d++) {
                        int x = row + directions[d];
                        int y = col + directions[d + 1];
                        while (x >= 0 && x < n && y >= 0 && y < n && board[x][y] != 'B') {
                            if (board[x][y] == 'p') {
                                captured++;
                                break;
                            }
                            x += directions[d];
                            y += directions[d + 1];
                        }
                    }
                    return captured;
                }
            }
        }
        return 0;
    }
}