package battleships.in.a.board;

/**
 * Source: https://leetcode.com/problems/battleships-in-a-board/
 *
 * Given an 2D board, count how many battleships are in it. The battleships are represented with
 * 'X's, empty slots are represented with '.'s. You may assume the following rules:
 * You receive a valid board, made of only battleships or empty slots.
 * Battleships can only be placed horizontally or vertically. In other words, they can only be made
 * of the shape 1xN (1 row, N columns) or Nx1 (N rows, 1 column), where N can be of any size.
 * At least one horizontal or vertical cell separates between two battleships -
 * there are no adjacent battleships.
 *
 * Example:
 * X..X
 * ...X
 * ...X
 * In the above board there are 2 battleships.
 *
 * Invalid Example:
 * ...X
 * XXXX
 * ...X
 * This is an invalid board that you will not receive -
 * as battleships will always have a cell separating between them.
 *
 * Constraints:
 *
 * Result:
 * Runtime: 0 ms, faster than 100.00% of Java online submissions
 * Memory Usage: 38.3 MB, less than 91.15% of Java online submissions
 */

public class Solution {
    public int countBattleships(char[][] board) {
        if (board[0].length == 0) {
            return 0;
        }
        int rsl = checkFirstLine(board);
        rsl += checkFirstColumn(board);
        for (int row = 1; row < board.length; row++) {
            for (int cell = 1; cell < board[row].length; cell++) {
                if (
                        board[row][cell] == 'X'
                        && board[row - 1][cell] == '.'
                        && board[row][cell - 1] == '.'
                ) {
                    rsl++;
                }
            }
        }
        return rsl;
    }

    private int checkFirstLine(char[][] board) {
        int rsl = board[0][0] == 'X' ? 1 : 0;
        for (int i = 1; i < board[0].length; i++) {
            if (board[0][i] == 'X' && board[0][i - 1] == '.') {
                rsl++;
            }
        }
        return rsl;
    }

    private int checkFirstColumn(char[][] board) {
        int rsl = 0;
        for (int i = 1; i < board.length; i++) {
            if (board[i][0] == 'X' && board[i - 1][0] == '.') {
                rsl++;
            }
        }
        return rsl;
    }
}
