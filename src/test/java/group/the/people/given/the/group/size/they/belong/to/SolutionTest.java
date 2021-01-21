package group.the.people.given.the.group.size.they.belong.to;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] input = new int[] {3, 3, 3, 3, 3, 1, 3};
        List<List<Integer>> expected = List.of(
                List.of(0, 1, 2),
                List.of(5),
                List.of(3, 4, 6)
        );
        List<List<Integer>> out = solution.groupThePeople(input);
        assertThat(out, is(expected));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] input = new int[] {2, 1, 3, 3, 3, 2};
        List<List<Integer>> expected = List.of(
                List.of(1),
                List.of(0, 5),
                List.of(2, 3, 4)
        );
        List<List<Integer>> out = solution.groupThePeople(input);
        assertThat(out, is(expected));
    }
}