package subrectangle.queries;

import org.junit.Test;

import static org.junit.Assert.*;

public class SubrectangleQueriesTest {
    @Test
    public void test1() {
        SubrectangleQueries subrectangleQueries = new SubrectangleQueries(new int[][]{
                {1, 2, 1},
                {4, 3, 4},
                {3, 2, 1},
                {1, 1, 1}
        });
        assertEquals(1, subrectangleQueries.getValue(0, 2));
        subrectangleQueries.updateSubrectangle(0, 0, 3, 2, 5);
        assertEquals(5, subrectangleQueries.getValue(0, 2));
        assertEquals(5, subrectangleQueries.getValue(3, 1));
        subrectangleQueries.updateSubrectangle(3, 0, 3, 2, 10);
        assertEquals(10, subrectangleQueries.getValue(3, 1));
        assertEquals(5, subrectangleQueries.getValue(0, 2));
    }

    @Test
    public void test2() {
        SubrectangleQueries subrectangleQueries = new SubrectangleQueries(new int[][]{
                {1, 1, 1},
                {2, 2, 2},
                {3, 3, 3}
        });
        assertEquals(1, subrectangleQueries.getValue(0, 0));
        subrectangleQueries.updateSubrectangle(0, 0, 2, 2, 100);
        assertEquals(100, subrectangleQueries.getValue(0, 0));
        assertEquals(100, subrectangleQueries.getValue(2, 2));
        subrectangleQueries.updateSubrectangle(1, 1, 2, 2, 20);
        assertEquals(20, subrectangleQueries.getValue(2, 2));
    }
}