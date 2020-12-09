package zig.zag.conversion;

/**
 * Source: https://leetcode.com/problems/zigzag-conversion/
 *
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
 * (you may want to display this pattern in a fixed font for better legibility)
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 *
 * Write the code that will take a string and make this conversion given a number of rows:
 * string convert(string s, int numRows);
 *
 * Example:
 * Input: s = "PAYPALISHIRING", numRows = 3
 * Output: "PAHNAPLSIIGYIR"
 *
 * Input: s = "PAYPALISHIRING", numRows = 4
 * Output: "PINALSIGYAHRPI"
 * Explanation:
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 *
 * Constraints:
 * 1 <= s.length <= 1000
 * s consists of English letters (lower-case and upper-case), ',' and '.'.
 * 1 <= numRows <= 1000
 *
 *       cell
 *        |
 * |P  | A  | H   N|
 * |A P| L S| I I G|
 * |Y  | I  | R    |
 *   |          |
 * cell        cell
 *
 * numRows = 3
 * diagonalSize = numRows - 2 = 3 - 2 = 1
 * cellItems = diagonalSize + numRows = 1 + 3 = 4
 *
 * Result:
 * Runtime: 5 ms, faster than 73.00% of Java online submissions
 * Memory Usage: 39.7 MB, less than 50.41% of Java online submissions
 */

public class Solution {
    public String convert(String s, int numRows) {
        if (s.length() == 1 || numRows == 1) {
            return s;
        }
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < rows.length; i++) {
            rows[i] = new StringBuilder();
        }
        int diagonalSize = numRows - 2;
        int cellItems = diagonalSize + numRows;
        for (int i = 0, tmpRow = 0; i < s.length(); i++) {
            if (i % cellItems < numRows) {
                if (i != 0 && i % cellItems == 0) {
                    tmpRow--;
                    if (numRows == 2) {
                        tmpRow--;
                    }
                }
                rows[tmpRow++].append(s.charAt(i));
            } else {
                if (tmpRow == numRows) {
                    tmpRow--;
                }
                rows[--tmpRow].append(s.charAt(i));
            }
        }
        StringBuilder rsl = rows[0];
        for (int i = 1; i < rows.length; i++) {
            rsl.append(rows[i]);
        }
        return rsl.toString();
    }
}
