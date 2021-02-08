package battleships.in.a.board;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1() {
        Solution solution = new Solution();
        char[][] input = new char[][] {
                {'X', '.', 'X', '.', 'X'},
                {'X', '.', 'X', '.', 'X'},
                {'.', 'X', '.', '.', 'X'},
                {'.', '.', '.', 'X', '.'},
                {'X', 'X', 'X', '.', 'X'}
        };
        assertEquals(7, solution.countBattleships(input));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        char[][] input = new char[][] {
                {'X', 'X', 'X', '.', 'X'},
                {'.', '.', '.', '.', 'X'},
                {'X', 'X', '.', '.', 'X'},
                {'.', '.', '.', 'X', '.'},
                {'X', 'X', '.', 'X', '.'}
        };
        assertEquals(5, solution.countBattleships(input));
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        char[][] input = new char[][] {{}};
        assertEquals(0, solution.countBattleships(input));
    }
}