class Solution {
    public boolean isValidSudoku(char[][] board) {

        java.util.HashSet<String> set = new java.util.HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (board[i][j] == '.') {
                    continue;
                }

                char num = board[i][j];

                String row = num + " in row " + i;
                String col = num + " in col " + j;
                String box = num + " in box " + (i / 3) + "-" + (j / 3);

                if (!set.add(row)) {
                    return false;
                }

                if (!set.add(col)) {
                    return false;
                }

                if (!set.add(box)) {
                    return false;
                }
            }
        }

        return true;
    }
}