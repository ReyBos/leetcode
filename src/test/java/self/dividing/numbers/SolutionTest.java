package self.dividing.numbers;

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
    private int left;
    private int right;
    private List<Integer> expected;

    public SolutionTest(int left, int right, List<Integer> expected) {
        this.left = left;
        this.right = right;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> dataForTest() {
        return Arrays.asList(new Object[][] {
                {1, 22, List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22)}
        });
    }

    @Test
    public void selfDividingNumbers() {
        Solution solution = new Solution();
        assertThat(solution.selfDividingNumbers(left, right), is(expected));
    }
}