package goal.parser.interpretation;

/**
 * Source: https://leetcode.com/problems/goal-parser-interpretation/
 *
 * You own a Goal Parser that can interpret a string command. The command consists of
 * an alphabet of "G", "()" and/or "(al)" in some order. The Goal Parser will interpret "G"
 * as the string "G", "()" as the string "o", and "(al)" as the string "al".
 * The interpreted strings are then concatenated in the original order.
 *
 * Given the string command, return the Goal Parser's interpretation of command.
 *
 * Example:
 * Input: command = "G()(al)"
 * Output: "Goal"
 * Explanation: The Goal Parser interprets the command as follows:
 * G -> G
 * () -> o
 * (al) -> al
 * The final concatenated result is "Goal".
 *
 * Input: command = "G()()()()(al)"
 * Output: "Gooooal"
 *
 * Input: command = "(al)G(al)()()G"
 * Output: "alGalooG"
 *
 * Constraints:
 * 1 <= command.length <= 100
 * command consists of "G", "()", and/or "(al)" in some order.
 *
 * Result:
 * Runtime: 0 ms, faster than 100.00% of Java online submissions
 * Memory Usage: 37.5 MB, less than 50.90% of Java online submissions
 */

public class FirstSolution {
    public String interpret(String command) {
        StringBuilder rsl = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') {
                rsl.append('G');
            } else if (command.charAt(i + 1) == ')') {
                rsl.append('o');
                i++;
            } else {
                rsl.append("al");
                i += 3;
            }
        }
        return rsl.toString();
    }
}
