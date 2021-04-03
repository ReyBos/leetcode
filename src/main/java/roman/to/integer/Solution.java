package roman.to.integer;

/**
 * Source: https://leetcode.com/problems/roman-to-integer/
 *
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 *
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written
 * as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
 *
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral
 * for four is not IIII. Instead, the number four is written as IV. Because the one is before the
 * five we subtract it making four. The same principle applies to the number nine,
 * which is written as IX. There are six instances where subtraction is used:
 *
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given a roman numeral, convert it to an integer.
 *
 * Example:
 * Input: s = "III"
 * Output: 3
 *
 * Input: s = "IV"
 * Output: 4
 *
 * Input: s = "IX"
 * Output: 9
 *
 * Input: s = "LVIII"
 * Output: 58
 * Explanation: L = 50, V= 5, III = 3.
 *
 * Input: s = "MCMXCIV"
 * Output: 1994
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 *
 * Constraints:
 * 1 <= s.length <= 15
 * s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
 * It is guaranteed that s is a valid roman numeral in the range [1, 3999].
 *
 * Result:
 * Runtime: 4 ms, faster than 72.84% of Java online submissions
 * Memory Usage: 39.1 MB, less than 77.34% of Java online submissions
 */

public class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 != s.length()) {
                String test = s.substring(i, i + 2);
                int num = checkString(test);
                if (num != 0) {
                    sum += num;
                    i++;
                    continue;
                }
            }
            sum += convertChar(s.charAt(i));
        }
        return sum;
    }

    private int checkString(String s) {
        return switch (s) {
            case "IV" -> 4;
            case "IX" -> 9;
            case "XL" -> 40;
            case "XC" -> 90;
            case "CD" -> 400;
            case "CM" -> 900;
            default -> 0;
        };
    }

    private int convertChar(char ch) {
        return switch (ch) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
