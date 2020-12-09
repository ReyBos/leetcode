package zig.zag.conversion;
/**
 * * Result:
 * Runtime: 31 ms, faster than 12.19% of Java online submissions
 * Memory Usage: 40.9 MB, less than 11.83% of Java online submissions
 */

public class BadSolution {
    public String convert(String s, int numRows) {
        if (s.length() == 1 || numRows == 1) {
            return s;
        }
        int diagonalSize = numRows - 2;
        int cellItems = diagonalSize + numRows;
        int cellNums = (int) Math.ceil((double) s.length() / cellItems);
        int cellColumns = diagonalSize + 1;
        char[][] tmp = new char[numRows][cellNums * cellColumns];
        char[] str = s.toCharArray();
        for (int i = 0, tmpRow = 0, tmpColumn = 0; i < str.length; i++) {
            if (i % cellItems < numRows) {
                if (i != 0 && i % cellItems == 0) {
                    tmpRow--;
                    tmpColumn++;
                    if (numRows == 2) {
                        tmpRow--;
                    }
                }
                tmp[tmpRow++][tmpColumn] = str[i];
            } else {
                if (tmpRow == numRows) {
                    tmpRow--;
                }
                tmp[--tmpRow][++tmpColumn] = str[i];
            }
        }
        StringBuilder rsl = new StringBuilder();
        for (int i = 0; i < tmp.length; i++) {
            for (int j = 0; j < tmp[i].length; j++) {
                if (tmp[i][j] == '\u0000') {
                    continue;
                }
                rsl.append(tmp[i][j]);
            }
        }
        return rsl.toString();
    }
}
