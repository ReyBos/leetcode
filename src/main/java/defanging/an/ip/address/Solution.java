package defanging.an.ip.address;

/**
 * Source: https://leetcode.com/problems/defanging-an-ip-address/
 *
 * Given a valid (IPv4) IP address, return a defanged version of that IP address.
 * A defanged IP address replaces every period "." with "[.]".
 *
 * Example:
 * Input: address = "1.1.1.1"
 * Output: "1[.]1[.]1[.]1"
 *
 * Input: address = "255.100.50.0"
 * Output: "255[.]100[.]50[.]0"
 *
 * Constraints:
 * The given address is a valid IPv4 address.
 *
 * Result:
 * Runtime: 0 ms, faster than 100.00% of Java online submissions
 * Memory Usage: 36.9 MB, less than 78.00% of Java online submissions
 */

public class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
