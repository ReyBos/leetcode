package keys.and.rooms;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class SolutionTest {
    private List<List<Integer>> input;
    private boolean expected;

    public SolutionTest(List<List<Integer>> input, boolean expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> dataForTest() {
        return Arrays.asList(new Object[][] {
                {List.of(List.of(1), List.of(2), List.of(3), List.of()), true},
                {List.of(List.of(1, 3), List.of(3, 0, 1), List.of(2), List.of(0)), false}
        });
    }

    @Test
    public void canVisitAllRooms() {
        Solution solution = new Solution();
        assertThat(solution.canVisitAllRooms(input), is(expected));
    }
}