package keys.and.rooms;

import java.util.*;

/**
 * Source: https://leetcode.com/problems/keys-and-rooms/
 *
 * There are N rooms and you start in room 0.  Each room has a distinct number in 0, 1, 2, ..., N-1,
 * and each room may have some keys to access the next room.
 *
 * Formally, each room i has a list of keys rooms[i], and each key rooms[i][j] is an integer
 * in [0, 1, ..., N-1] where N = rooms.length.  A key rooms[i][j] = v opens the room with number v.
 *
 * Initially, all the rooms start locked (except for room 0).
 *
 * You can walk back and forth between rooms freely.
 *
 * Return true if and only if you can enter every room.
 *
 * Example:
 * Input: [[1],[2],[3],[]]
 * Output: true
 * Explanation:
 * We start in room 0, and pick up key 1.
 * We then go to room 1, and pick up key 2.
 * We then go to room 2, and pick up key 3.
 * We then go to room 3.  Since we were able to go to every room, we return true.
 *
 * Input: [[1,3],[3,0,1],[2],[0]]
 * Output: false
 * Explanation: We can't enter the room with number 2.
 *
 * Constraints:
 * 1 <= rooms.length <= 1000
 * 0 <= rooms[i].length <= 1000
 * The number of keys in all rooms combined is at most 3000.
 *
 * Result:
 * Runtime: 2 ms, faster than 49.68% of Java online submissions
 * Memory Usage: 38.9 MB, less than 64.34% of Java online submissions
 */

public class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> checkedKeys = new HashSet<>();
        checkedKeys.add(0);
        Queue<Integer> needCheck = new LinkedList<>(rooms.get(0));
        while (!needCheck.isEmpty()) {
            int currKey = needCheck.poll();
            if (checkedKeys.add(currKey)) {
                needCheck.addAll(rooms.get(currKey));
            }
        }
        return checkedKeys.size() == rooms.size();
    }
}
