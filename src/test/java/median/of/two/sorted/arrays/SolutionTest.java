package median.of.two.sorted.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void when12And34Then25() {
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3, 4};
        double out = Solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(2.5, out, 0.001);
    }

    @Test
    public void when13And2Then2() {
        int[] nums1 = new int[]{1, 3};
        int[] nums2 = new int[]{2};
        double out = Solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(2, out, 0.001);
    }

    @Test
    public void when00And00Then0() {
        int[] nums1 = new int[]{0, 0};
        int[] nums2 = new int[]{0, 0};
        double out = Solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(0, out, 0.001);
    }

    @Test
    public void whenEmptyAnd1Then1() {
        int[] nums1 = new int[]{};
        int[] nums2 = new int[]{1};
        double out = Solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(1, out, 0.001);
    }

    @Test
    public void when2AndEmptyThen2() {
        int[] nums1 = new int[]{2};
        int[] nums2 = new int[]{};
        double out = Solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(2, out, 0.001);
    }

    @Test
    public void when2And4Then3() {
        int[] nums1 = new int[]{2};
        int[] nums2 = new int[]{4};
        double out = Solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(3, out, 0.001);
    }

    @Test
    public void whenEmptyAndEmptyThen0() {
        int[] nums1 = new int[]{};
        int[] nums2 = new int[]{};
        double out = Solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(0, out, 0.001);
    }
}